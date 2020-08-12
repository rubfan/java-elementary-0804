package factorymethod;

public class CarDelivery implements Order{
    public void create(int orderId) {
        System.out.println("Order " + orderId + "sent to SpeedyCars delivery system");
    }

    public void deliveryConfirmation() {
        System.out.println("Land delivery confirmed");
    }
}
