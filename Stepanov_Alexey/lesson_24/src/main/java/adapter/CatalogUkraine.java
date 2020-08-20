package adapter;

public class CatalogUkraine {
    private Car car;

    public CatalogUkraine(Car car) {
        this.car = car;
    }

    public void speedLimit() {
        System.out.println("Speed limit: " + car.getSpeedMiles() * 1.61 + " km / hour");
    }

    public void name() {
        System.out.println("Name: " + car.getName());
    }

    public void tankSize() {
        System.out.println("Fuel tank size: " + car.getTankSizeGallons() * 3.8 + " liters");
    }
}
