package adapter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(211, "Ferrari", 22.7);

        CatalogUSA carCatalogUSA = new CatalogUSA(car);
        Catalog catalog = new Catalog(carCatalogUSA);
        catalog.create();

        System.out.println();

        CatalogAdapter carCatalogUA = new CatalogAdapter(new CatalogUkraine(car));
        Catalog catalogUA = new Catalog(carCatalogUA);
        catalogUA.create();
    }
}

/* output:
Name: Ferrari
Speed limit: 211.0 miles / hour
Fuel tank size: 22.7 gallons

Name: Ferrari
Speed limit: 339.71000000000004 km / hour
Fuel tank size: 86.25999999999999 liters
 */
