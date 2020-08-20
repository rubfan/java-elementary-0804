package mediator;

public interface Action {
    void createOrder();

    void setOrder(Order order);

    String getInfo();

    Order getOrder();
}
