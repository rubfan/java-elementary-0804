package adapter;

public class CatalogUSA implements CarCatalog {
    private Car car;

    public CatalogUSA(Car car) {
        this.car = car;
    }

    public void speedLimit() {
        System.out.println("Speed limit: " + car.getSpeedMiles() + " miles / hour");
    }

    public void name() {
        System.out.println("Name: " + car.getName());
    }

    public void tankSize() {
        System.out.println("Fuel tank size: " + car.getTankSizeGallons() + " gallons");
    }
}
