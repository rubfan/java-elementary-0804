package template.method;

public class OnlineShopping extends ChristmasTimeShopping{
    @Override
    public void selectItem() {
        System.out.println("Put an item to a basket.");
        System.out.println("Make a choice with the packaging.");
        System.out.println("Fill the holder/delivery receiver form.");
    }

    @Override
    public void makeOrderPayment() {
        System.out.println("Pick option: Online Payment by Credit Card or Payment after delivery");
    }
    public  void makeDelivery(){
        System.out.println("Item delivered to client's address.");
    }
}
