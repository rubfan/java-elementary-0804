package templateMethod;

public class TemplateMethodClient {
    public static void main(String[] args) {
        SafeTemplate taker = new MoneyTaker();
        SafeTemplate depositor = new MoneyDepositor();

        taker.operation();
        depositor.operation();
    }
}
