package mediator;

public class Cooker implements Participant {
    private Mediator mediator;
    private String id;
    private Order order;

    public String getId() {
        return this.id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Cooker(Mediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;
    }

    public void createOrder() {
        System.out.println(this.id + " create order: ");
        for (Product product : order.getProducts()) {
            System.out.println(product.getName());
        }
    }
}
