package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        TeslaModel3 model3 = new TeslaModel3();

        model3.previousStatus();
        model3.showStatus();

        model3.nextStatus();
        model3.showStatus();

        model3.nextStatus();
        model3.showStatus();

        model3.nextStatus();
        model3.showStatus();
        model3.nextStatus();
    }
}
