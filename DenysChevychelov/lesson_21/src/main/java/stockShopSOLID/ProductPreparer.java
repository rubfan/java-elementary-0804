package stockShopSOLID;

import java.util.List;

public class ProductPreparer implements Preparer {
    //Single Responsibility Principle
    public Product prepareProduct(List<Product> productsList, int productIndex) {
        return productsList.get(productIndex);
    }
}
