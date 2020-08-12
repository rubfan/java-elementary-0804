package adapter;

public class Catalog {
    private CarCatalog carCatalog;

    public Catalog(CarCatalog carCatalog) {
        this.carCatalog = carCatalog;
    }

    public void create() {
        carCatalog.name();
        carCatalog.speedLimit();
        carCatalog.tankSize();
    }
}
