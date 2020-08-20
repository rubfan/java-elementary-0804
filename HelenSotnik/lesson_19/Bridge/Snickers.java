package bridge;

public class Snickers extends Product {
    public Snickers(BrandName brandName) {
        super(brandName);
    }

    public String produce() {
        return "Snickers have been produced! " + brandName.apply();
    }
}
