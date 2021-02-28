package store;

public class Category {

    private String categoryName;
    private Product[] products;

    protected Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Product[] getProducts() {
        return this.products;
    }

    protected void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    protected void setProducts(Product... products) {
        this.products = products;
    }
}
