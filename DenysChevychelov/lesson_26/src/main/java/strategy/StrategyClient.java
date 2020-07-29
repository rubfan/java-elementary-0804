package strategy;

public class StrategyClient {
    public static void main(String[] args) {
        AutomaticCarWasher acw = new AutomaticCarWasher();

        acw.setOperation(new Rest());
        acw.doOperation();

        acw.setOperation(new ShampooHandler());
        acw.doOperation();

        acw.setOperation(new TimeoutStarter());
        acw.doOperation();

        acw.setOperation(new Washer());
        acw.doOperation();

        acw.setOperation(new Dryer());
        acw.doOperation();

        acw.setOperation(new Rest());
        acw.doOperation();

    }
}
