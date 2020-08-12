package abstractfactory;

public interface RestaurantFactory {
    String getType();
    String getLocation();
    int getEmployees();
    boolean isDelivery();
}
