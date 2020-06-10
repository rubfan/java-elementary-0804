package Calendar;

public class Calendar {
    public BuyC buyC = new BuyC();

    public static void main(String[] args) {
        Calendar calendar1 = new Calendar();
        calendar1.buyC.showTypes();
        calendar1.buyC.moneyToPay("solar", 5);
    }
}
