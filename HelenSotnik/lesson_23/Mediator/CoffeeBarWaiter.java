package mediator;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBarWaiter implements Waiter {
    private Client client;
    private Cook cook;
    private List<MenuDish> menuDishes;

    public CoffeeBarWaiter(Client client, Cook cook) {
        this.client = client;
        this.cook = cook;
        this.menuDishes = new ArrayList<>();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public List<MenuDish> getMenuDishes() {
        return menuDishes;
    }

    public void addDishesToOrder(MenuDish menuDish) {
        this.menuDishes.add(menuDish);
    }

    public void showOrder() {
        for (MenuDish menuDish : getMenuDishes()) {
            System.out.println(menuDish.toString());
        }
    }

    @Override
    public void takeOrder() {
        client.makeOrder();
        showOrder();
        System.out.println();

    }

    @Override
    public void passOrder() {
        cook.cookOrder();
        showOrder();
        System.out.println();
    }

    @Override
    public void bringOrder() {
        System.out.println("Waiter brought the order: ");
        showOrder();
        System.out.println();
    }

    @Override
    public void passFeedback() {
        System.out.println("Waiter passed clients feedback to cook: ");
        client.giveFeedback();
        System.out.println("Cook accepted feedback:  ");
        cook.acceptFeedback();
    }
}
