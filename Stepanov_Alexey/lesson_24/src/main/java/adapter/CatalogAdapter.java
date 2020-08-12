package adapter;

public class CatalogAdapter implements CarCatalog {
    private CatalogUkraine catalogUkraine;

    public CatalogAdapter(CatalogUkraine catalogUkraine) {
        this.catalogUkraine = catalogUkraine;
    }

    public void speedLimit() {
        catalogUkraine.speedLimit();
    }

    public void name() {
        catalogUkraine.name();
    }

    public void tankSize() {
        catalogUkraine.tankSize();
    }
}
