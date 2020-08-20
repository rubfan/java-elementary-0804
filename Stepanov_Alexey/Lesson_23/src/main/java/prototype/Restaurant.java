package prototype;

public class Restaurant implements Copyable {
    private String location;
    private int employees;
    private boolean delivery;

    public Restaurant(String location, int employees, boolean delivery) {
        this.location = location;
        this.employees = employees;
        this.delivery = delivery;
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

    public Restaurant copy() {
        return new Restaurant(location, employees, delivery);
    }
}
