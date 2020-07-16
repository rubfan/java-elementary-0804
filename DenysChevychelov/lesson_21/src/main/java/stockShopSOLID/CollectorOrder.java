package stockShopSOLID;

import java.util.List;

// Interface Segregation Principle
public interface CollectorOrder {
    Product collectOrder(List<Product> productList, Product product);
}
