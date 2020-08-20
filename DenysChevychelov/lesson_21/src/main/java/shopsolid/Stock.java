package shopsolid;

import java.util.List;

public class Stock {
    private List<Product> productList;

    public Stock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }
}
