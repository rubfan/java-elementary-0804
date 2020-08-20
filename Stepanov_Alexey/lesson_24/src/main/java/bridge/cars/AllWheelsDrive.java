package bridge.cars;

import bridge.modifications.Modification;

public class AllWheelsDrive implements Car {
    private Modification modification;
    private String brand;
    private String model;
    private int wheelRadius;

    public AllWheelsDrive(Modification modification, String brand, String model, int wheelRadius) {
        this.modification = modification;
        this.brand = brand;
        this.model = model;
        this.wheelRadius = wheelRadius;
    }

    public Modification getModification() {
        return modification;
    }

    public void setModification(Modification modification) {
        this.modification = modification;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
}
