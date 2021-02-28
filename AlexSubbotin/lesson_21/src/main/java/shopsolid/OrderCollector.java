package shopsolid;

import java.util.List;

public interface OrderCollector {

    Product collectOrder(List<Product> productList, Product product);
}
