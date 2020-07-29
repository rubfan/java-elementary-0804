package mediator;

public class Visitor implements Participant {
    private Mediator mediator;
    private String id;
    private Order order;

    public Visitor(Mediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void createOrder() {
        System.out.println(this.id + " making order: ");
        for (Product product : this.order.getProducts()) {
            System.out.println(product.getName());
        }
    }
}
