package shopsolid;

import java.util.List;

public class OrderCollectorSendControllerWithConfirmation extends OrderCollectorSendControler implements ConfirmationSender {

    @Override
    public Product collectOrder(List<Product> productList, Product product) {
        printConfirmation(); //This method break Liskov’s Substitution Principle.(Prints an extra line)
        sendConfirmationSMS();
        return super.collectOrder(productList, product);
    }

    //This method break Liskov’s Substitution Principle.(Prints an extra line)
    private void printConfirmation() {
        System.out.println("Your order complete");
    }

    public void sendConfirmationSMS() {
        String sms = "SMS: Your order on the way.";
        //sms sender body...
        System.out.println(sms);
    }
}
