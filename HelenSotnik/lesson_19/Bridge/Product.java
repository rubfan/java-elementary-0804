package bridge;

public abstract class Product {
    protected BrandName brandName;

    public Product(BrandName brandName) {
        this.brandName = brandName;
    }

    abstract public String produce();
}
