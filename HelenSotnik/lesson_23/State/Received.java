package state;

public class Received implements TeslaModel3Status {
    @Override
    public void previousStatus(TeslaModel3 tesla) {
        tesla.setStatus(new Delivered());
    }

    @Override
    public void nextStatus(TeslaModel3 tesla) {
        System.out.println("No new status");
    }

    @Override
    public void showStatus() {
        System.out.println("Model 3 total payment done, received by client");
    }
}
