package mediator;

import java.util.ArrayList;

public class Waiter implements Mediator {
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void createOrder(Order order) {
        order.setWaiter(this.name);
        orders.add(order);
    }

    public void getDetails() {
        for (Order order : orders) {
            System.out.println("Order of " + order.getWaiter() +
                    "\tID: " + order.getOrderID() +
                    "\tCook: " + order.getCook().getName() +
                    "\tClient: " + order.getClient().getName());
            getItems((ArrayList<Item>) order.getItemBucket());
            System.out.println();
        }
    }

    private void getItems(ArrayList<Item> items) {
        System.out.print("\t\tOrdered: ");
        for (Item item : items) {
            System.out.print(item.getLabel() + " ");
        }
    }
}
