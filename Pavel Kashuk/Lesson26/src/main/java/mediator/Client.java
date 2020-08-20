package mediator;

public class Client {
    public static void main(String[] args) {
        Product coffee = new Product("Coffee");
        Product tea = new Product("Tea");
        Product cake = new Product("Cake");

        Mediator mediator = new Waiter();

        Action firstCooker = new Chef(mediator, "First cooker");
        Action secondCooker = new Chef(mediator, "Second cooker");
        Action firstVisitor = new Guest(mediator, "Bob");
        Action secondVisitor = new Guest(mediator, "Ashly");

        Order firstOrder = new Order(firstVisitor.getInfo());
        firstOrder.addProduct(coffee);
        firstOrder.addProduct(cake);

        mediator.addAction(firstVisitor, firstOrder);
        mediator.addAction(firstCooker, firstOrder);

        Order secondOrder = new Order(secondVisitor.getInfo());
        secondOrder.addProduct(tea);
        secondOrder.addProduct(cake);

        mediator.addAction(secondVisitor, secondOrder);
        mediator.addAction(secondCooker, secondOrder);

        mediator.transferFrom(firstVisitor);
        System.out.println("\n=====================\n");

        mediator.transferFrom(firstCooker);
        System.out.println("\n=====================\n");

        mediator.transferFrom(secondVisitor);
        System.out.println("\n=====================\n");

        mediator.transferFrom(secondCooker);
        System.out.println("\n=====================\n");
    }
}
