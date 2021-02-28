package shopsolid;

import java.util.List;

public class OrderCollectorSendControler implements OrderCollector, OrderSender {

    private ProductChecker pc;
    private ProductPreparer pp;

    public OrderCollectorSendControler() {
        this.pc = new ProductChecker();
        this.pp = new ProductPreparer();
    }

    public Product collectOrder(List<Product> productList, Product product) {
        int productIndex = pc.checkProduct(productList, product);
        return pp.prepareProduct(productList, productIndex);
    }

    public void sendOrder(Product product) {
        System.out.println("Order: " + product.toString() + " is send.");
    }
}
