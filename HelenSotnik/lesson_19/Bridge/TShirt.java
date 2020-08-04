package bridge;

public class TShirt extends Product {
    public TShirt(BrandName brandName) {
        super(brandName);
    }

    public String produce() {
        return "TShirt has been produced! " + brandName.apply();
    }
}
