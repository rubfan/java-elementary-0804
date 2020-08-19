package mediator;

public class Main {
    public static void main(String[] args) {
        Item tea = new Item("Tea");
        Item coffee = new Item("Coffee");
        Item cookies = new Item("Cookies");

        Mediator waiter = new Waiter("Alice");
        Mediator waiter1 = new Waiter("Bob");

        Client client = new Client(waiter, "Bobby");
        Client client1 = new Client(waiter, "Piter");

        Cook cook = new Cook(waiter, "Alex");
        Cook cook1 = new Cook(waiter, "Sharma");

        Order order = new Order("123");
        Order order1 = new Order("231");
        Order order2 = new Order("344");
        Order order3 = new Order("555");

        client.add(order);
        cook.add(order);
        order.setItemBucket(coffee, tea, coffee, cookies);
        waiter.createOrder(order);

        client1.add(order1);
        cook1.add(order1);
        order1.setItemBucket(tea, tea, tea);
        order1.setItemBucket(coffee);
        waiter.createOrder(order1);

        client.add(order2);
        cook1.add(order2);
        order2.setItemBucket(tea, coffee);
        waiter.createOrder(order2);

        client1.add(order3);
        cook.add(order3);
        order3.setItemBucket(cookies);
        waiter1.createOrder(order3);

        waiter.getDetails();
        waiter1.getDetails();
    }
}
/* output
Order of Alice	ID: 123	Cook: Alex	Client: Bobby
		Ordered: Coffee Tea Coffee Cookies
Order of Alice	ID: 231	Cook: Sharma	Client: Piter
		Ordered: Tea Tea Tea Coffee
Order of Alice	ID: 344	Cook: Sharma	Client: Bobby
		Ordered: Tea Coffee
Order of Bob	ID: 555	Cook: Alex	Client: Piter
		Ordered: Cookies
 */