package mediator;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        KitchenerCake kitchener1 = new KitchenerCake(waiter, "Gak Olivie");
        KitchenerDrinks kitchener2 = new KitchenerDrinks(waiter, "Marco Polo");
        User client1 = new Client(waiter, "Sofiya");
        User client2 = new Client(waiter, "Nastya");

        waiter.setKitchener(kitchener1, kitchener2);
        waiter.addUser(client1);
        waiter.addUser(client2);
        client1.sendMessage(Menu.COFFEE);
        client2.sendMessage(Menu.COOKIES);

    }
}

interface Mediator {
    public void sendMessage(User user, Menu menu);
}

enum Menu {
    TEA("a cup of tea"), COFFEE("a cup of coffee"), COOKIES("signature cake");
    String nameOrder;

    Menu(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }
}

abstract class User {
    Mediator mediator;
    String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Menu menu) {
        mediator.sendMessage(this, menu);
    }

    abstract void getMessage(User user, Menu menu);
}

class Waiter implements Mediator {
    private List<User> clients = new ArrayList<User>();
    private Client clientOrder;
    private User userOrder;
    KitchenerCake kitchenerCake;
    KitchenerDrinks kitchenerDrinks;

    public void addUser(User user) {
        clients.add(user);
    }

    public void setKitchener(KitchenerCake kitchenerCake, KitchenerDrinks kitchenerDrinks) {
        this.kitchenerCake = kitchenerCake;
        this.kitchenerDrinks = kitchenerDrinks;
    }

    public void sendMessage(User user, Menu menu) {
        for (User u : clients) {
            if (u == user) {
                clientOrder = (Client) user;
                chooseKitchener(user, menu);
            } else if (userOrder == user) {
                userOrder = null;
                clientOrder.getMessage(user, menu);
            }
        }
    }


    private void chooseKitchener(User user, Menu menu) {
        switch (menu) {
            case TEA:
                userOrder = kitchenerDrinks;
                kitchenerDrinks.getMessage(user, menu);
                break;
            case COOKIES:
                userOrder = kitchenerCake;
                kitchenerCake.getMessage(user, menu);
                break;
            case COFFEE:
                userOrder = kitchenerDrinks;
                kitchenerDrinks.getMessage(user, menu);
                break;
        }
    }
}

class KitchenerCake extends User {
    public KitchenerCake(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void getMessage(User user, Menu menu) {
        System.out.println("Please prepare - " + menu.getNameOrder() + ", for client - " + user.getName());
        super.sendMessage(menu);
    }
}

class KitchenerDrinks extends User {
    public KitchenerDrinks(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void getMessage(User user, Menu menu) {
        System.out.println("Please prepare - " + menu.getNameOrder() + ", for client - " + user.getName());
        super.sendMessage(menu);
    }
}

class Client extends User {
    public Client(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void getMessage(User user, Menu menu) {
        System.out.println("Your order - " + menu.getNameOrder() + ", is ready! Bon appetit from - " + user.getName());
    }
}
