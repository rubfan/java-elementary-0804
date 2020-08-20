package shopsolid;

import java.util.List;

// Interface Segregation Principle
public interface Checker {
    int checkProduct(List<Product> productsList, Product product);
}
