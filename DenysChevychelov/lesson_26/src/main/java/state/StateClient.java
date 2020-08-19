package state;

public class StateClient {
    public static void main(String[] args) {
        Operation operation = new Rest();
        AutomaticCarWasher acw = new AutomaticCarWasher();

        acw.setOperation(operation);

        for (int i = 0; i < 6; i++) {
            acw.doOperation();
            acw.changeOperation();
        }
    }
}
