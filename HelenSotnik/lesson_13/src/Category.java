package structure;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;

    protected Category(String name) {
        this.name = name;
    }

    protected Product[] getProducts() {
        return products;
    }

    protected void setProducts(Product[] pr) {
        this.products = pr;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "Category " + name + "\n" + "includes products:" + Arrays.toString(products);
    }
}
