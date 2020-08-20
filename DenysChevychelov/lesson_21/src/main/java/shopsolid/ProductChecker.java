package shopsolid;

import java.util.List;

public class ProductChecker implements Checker {
    //Single Responsibility Principle
    public int checkProduct(List<Product> productsList, Product product) {
        int productIndex = productsList.size() + 1;
        if (productsList.contains(product)) {
            productIndex = productsList.indexOf(product);
        }
        return productIndex;
    }
}
