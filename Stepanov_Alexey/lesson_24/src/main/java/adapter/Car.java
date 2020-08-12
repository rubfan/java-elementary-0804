package adapter;

public class Car {
    private double speedMiles;
    private String name;
    private double tankSizeGallons;

    public Car(double speedMiles, String name, double tankSizeGallons) {
        this.speedMiles = speedMiles;
        this.name = name;
        this.tankSizeGallons = tankSizeGallons;
    }

    public double getSpeedMiles() {
        return speedMiles;
    }

    public void setSpeedMiles(double speedMiles) {
        this.speedMiles = speedMiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankSizeGallons() {
        return tankSizeGallons;
    }

    public void setTankSizeGallons(double tankSizeGallons) {
        this.tankSizeGallons = tankSizeGallons;
    }
}
