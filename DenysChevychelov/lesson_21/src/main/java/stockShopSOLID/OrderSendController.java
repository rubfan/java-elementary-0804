package stockShopSOLID;

import java.util.List;

public class OrderSendController implements CollectorOrder, OrderSender {
    //Dependency Inversion Principle
    private ProductChecker pc;
    private ProductPreparer pp;

    public OrderSendController(ProductChecker pc, ProductPreparer pp) {
        this.pc = pc;
        this.pp = pp;
    }

    public Product collectOrder(List<Product> productList, Product product) {
        int productIndex = pc.checkProduct(productList, product);
        return pp.prepareProduct(productList, productIndex);
    }

    public void sendOrder(Product product) {
        System.out.println("Order: " + product.toString() + " is send.");
    }
}
