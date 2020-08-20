package mediator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;

    private List<Product> products;

    public Order(String id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
