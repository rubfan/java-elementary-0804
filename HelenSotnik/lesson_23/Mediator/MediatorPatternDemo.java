package mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) throws NullPointerException {
        MenuDish coffee = new MenuDish("Coffee");
        MenuDish tea = new MenuDish("Tea");
        MenuDish cookie = new MenuDish("Cookie");

        CoffeeBarWaiter waiter = new CoffeeBarWaiter(new Client(), new Cook());
        waiter.addDishesToOrder(coffee);
        waiter.addDishesToOrder(cookie);

        waiter.takeOrder();
        waiter.passOrder();
        waiter.bringOrder();
        waiter.passFeedback();
    }
}
