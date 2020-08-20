package template.method;

public class ShoppingMallShopping extends ChristmasTimeShopping {

    @Override
    public void selectItem() {
        System.out.println("Take the item to checkout desk.");
        System.out.println("Make a choice with the packaging.");
    }

    @Override
    public void makeOrderPayment() {
        System.out.println("Use cash or credit card to pay.");
    }
}
