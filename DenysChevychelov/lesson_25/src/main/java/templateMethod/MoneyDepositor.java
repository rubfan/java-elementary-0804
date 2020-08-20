package templateMethod;

public class MoneyDepositor extends SafeTemplate {

    @Override
    public void middleOperation() {
        System.out.println("Put the money...");
    }
}
