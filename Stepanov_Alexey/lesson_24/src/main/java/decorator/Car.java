package decorator;

public class Car {
    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String details() {
        return model;
    }
}
