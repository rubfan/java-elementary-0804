package stockShopSOLID;

import java.util.List;

//Dependency Inversion Principle
public class ProductPreparer implements Preparer {
    //Single Responsibility Principle
    public Product prepareProduct(List<Product> productsList, int productIndex) {
        return productsList.get(productIndex);
    }
}
