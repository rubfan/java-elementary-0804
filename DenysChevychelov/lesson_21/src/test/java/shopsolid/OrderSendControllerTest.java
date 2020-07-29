package shopsolid;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class OrderSendControllerTest {
    private ArrayList shopProductsList = new ArrayList<Product>();
    private Stock stockShop = new Stock(shopProductsList);
    private Product bread = new Product("White bread", 15);
    private Product meat = new Product("Pork meat", 100);
    private Product fish = new Product("Dorado fish", 150);
    private Product milk = new Product("Cow milk", 25);

    @Before
    public void initProducts() {
        stockShop.addProduct(bread);
        stockShop.addProduct(meat);
        stockShop.addProduct(fish);
        stockShop.addProduct(milk);
    }

    @Test
    public void sendOrderTest() {
        OrderSendController orderController = new OrderSendController(
                new ProductChecker(), new ProductPreparer());
        orderController.sendOrder(orderController.collectOrder(shopProductsList, meat));
    }

    @Test
    public void sendOrderWithConfirmationTest() {
        OrderSendControllerWithConfirmation ocwc = new OrderSendControllerWithConfirmation(
                new ProductChecker(), new ProductPreparer());
        ocwc.sendOrder(ocwc.collectOrder(shopProductsList, milk));
    }
}
