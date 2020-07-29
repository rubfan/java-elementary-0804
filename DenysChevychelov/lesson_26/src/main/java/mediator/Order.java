package mediator;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderPicker {
    private String id;
    private List<Product> products;

    public Order(String id) {
        this.id = id;
        this.products = new ArrayList<Product>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
