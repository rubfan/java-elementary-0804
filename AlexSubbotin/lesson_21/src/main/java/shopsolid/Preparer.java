package shopsolid;

import java.util.List;

public interface Preparer {

    Product prepareProduct(List<Product> productsList, int productIndex);
}
