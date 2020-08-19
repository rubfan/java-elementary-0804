package mediator;

import sun.nio.cs.ext.MacCentralEurope;

public class MediatorClient {
    public static void main(String[] args) {
        Product cake = new Product("Cake");
        Product tea = new Product("TEA");
        Product coffee = new Product("Coffee");

        Mediator mediator = new Waiter();
        Participant cooker1 = new Cooker(mediator, "COOKER1");
        Participant cooker2 = new Cooker(mediator, "COOKER2");
        Participant visitor1 = new Visitor(mediator, "Vasya");
        Participant visitor2 = new Visitor(mediator, "Petya");

        Order order1 = new Order(visitor1.getId());
        order1.addProduct(cake);
        order1.addProduct(coffee);
        mediator.addParticipant(visitor1, order1);
        mediator.addParticipant(cooker1, order1);

        Order order2 = new Order(visitor2.getId());
        order2.addProduct(tea);
        mediator.addParticipant(visitor2, order2);
        mediator.addParticipant(cooker2, order2);

        mediator.transferFrom(visitor1);
        System.out.println("_____________________");
        mediator.transferFrom(cooker1);
        System.out.println("_____________________");
        mediator.transferFrom(visitor2);
        System.out.println("_____________________");
        mediator.transferFrom(cooker2);
    }
}
