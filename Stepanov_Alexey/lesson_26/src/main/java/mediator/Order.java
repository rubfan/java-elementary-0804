package mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private String orderID;
    private String waiter;
    private Cook cook;
    private Client client;
    private List<Item> itemBucket = new ArrayList<>();

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public List<Item> getItemBucket() {
        return itemBucket;
    }

    public void setItemBucket(Item... items) {
        itemBucket.addAll(Arrays.asList(items));
    }

    public Order(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
