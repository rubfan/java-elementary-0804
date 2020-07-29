package Shop;

class Category {
    private String nameCategory;
    private Product[] products;

    public Category(String nameCategory, Product[] products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }
}