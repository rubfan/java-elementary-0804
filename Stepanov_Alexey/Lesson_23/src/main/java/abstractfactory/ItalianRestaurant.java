package abstractfactory;

public class ItalianRestaurant implements RestaurantFactory {
    private String type;
    private String location;
    private int employees;
    private boolean delivery;

    public ItalianRestaurant(String type, String location, int employees, boolean delivery) {
        this.type = type;
        this.location = location;
        this.employees = employees;
        this.delivery = delivery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
