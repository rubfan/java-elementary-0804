package shopsolid;

import java.util.List;

public class ProductPreparer implements Preparer {

    public Product prepareProduct(List<Product> productsList, int productIndex) {
        return productsList.get(productIndex);
    }
}
