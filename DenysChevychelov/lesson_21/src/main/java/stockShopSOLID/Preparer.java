package stockShopSOLID;

import java.util.List;

// Interface Segregation Principle
public interface Preparer {
    Product prepareProduct(List<Product> productsList, int productIndex);
}
