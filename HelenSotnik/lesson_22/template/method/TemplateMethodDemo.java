package template.method;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        ChristmasTimeShopping onlineShopping = new OnlineShopping();
        onlineShopping.setChristmasGift(true);
        System.out.println("Christmas Online Shopping case: ");
        onlineShopping.workOnOrder();

        System.out.println("=============================================");

        ChristmasTimeShopping shoppingMallShopping = new ShoppingMallShopping();
        shoppingMallShopping.setChristmasGift(false);
        System.out.println("Christmas Shopping in Shopping Mall case: ");
        shoppingMallShopping.workOnOrder();
    }
}
