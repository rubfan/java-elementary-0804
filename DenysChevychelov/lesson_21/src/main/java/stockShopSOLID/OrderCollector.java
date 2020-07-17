package stockShopSOLID;

import java.util.List;

// Interface Segregation Principle
public interface OrderCollector {
    Product collectOrder(List<Product> productList, Product product);
}
