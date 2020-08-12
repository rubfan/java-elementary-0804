package factorymethod;

public class PlaneDelivery implements Order{
    public void create(int orderId) {
        System.out.println("Order " + orderId + "sent to AirWays delivery system");
    }

    public void deliveryConfirmation() {
        System.out.println("Air delivery confirmed");
    }
}
