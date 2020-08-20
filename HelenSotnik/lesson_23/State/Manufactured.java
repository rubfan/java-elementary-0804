package state;

public class Manufactured implements TeslaModel3Status {
    @Override
    public void previousStatus(TeslaModel3 tesla) {
        tesla.setStatus(new PreOrdered());
    }

    @Override
    public void nextStatus(TeslaModel3 tesla) {
        tesla.setStatus(new Delivered());
    }

    @Override
    public void showStatus() {
        System.out.println("Model 3 is manufactured, not delivered to destination country");
    }
}
