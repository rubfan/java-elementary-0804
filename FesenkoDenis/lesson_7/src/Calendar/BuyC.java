package Calendar;

public class BuyC {
    private final double priceS = 14.99, priceL = 11.49;
    private String type;
    private int number;

    public void showTypes() {
        System.out.printf("Calendars fall into few types: solar %.2f$ , lunar %.2f$\n", priceS, priceL);
    }

    public void moneyToPay(String s, int a) {
        switch (s) {
            case "solar":
                System.out.println("You should pay: " + (a * priceS));
                break;
            case "lunar":
                System.out.println("You should pay: " + (a * priceL));
                break;
            default:
                System.out.println("Try to input correct");
        }
    }
}
