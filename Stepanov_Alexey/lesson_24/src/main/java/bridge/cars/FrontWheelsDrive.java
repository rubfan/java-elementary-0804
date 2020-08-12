package bridge.cars;

import bridge.modifications.Modification;

public class FrontWheelsDrive implements Car {
    private Modification modification;
    private String brand;
    private String model;

    public FrontWheelsDrive(Modification modification, String brand, String model) {
        this.modification = modification;
        this.brand = brand;
        this.model = model;
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
}
