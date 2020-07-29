package mediator;

public interface Participant {
    void createOrder();
    void setOrder(Order order);
    String getId();
    Order getOrder();
}
