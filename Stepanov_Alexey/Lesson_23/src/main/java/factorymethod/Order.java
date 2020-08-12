package factorymethod;

public interface Order {
    void create(int orderId);
    void deliveryConfirmation();
}
