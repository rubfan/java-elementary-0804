package mediator;

public class Guest implements Action {

    private Mediator mediator;

    private String name;

    private Order order;

    public Guest(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void createOrder() {
        System.out.println(this.name + " making order: ");
        for (Product product : this.order.getProducts()) {
            System.out.println(product.getName());
        }
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
