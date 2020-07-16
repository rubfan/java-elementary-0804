package stockShopSOLID;

// Interface Segregation Principle
public interface OrderSender {
    void sendOrder(Product product);
}
