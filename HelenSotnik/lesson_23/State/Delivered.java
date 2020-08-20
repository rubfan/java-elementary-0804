package state;

public class Delivered implements TeslaModel3Status {
    @Override
    public void previousStatus(TeslaModel3 tesla) {
        tesla.setStatus(new Manufactured());
    }

    @Override
    public void nextStatus(TeslaModel3 tesla) {
        tesla.setStatus(new Received());
    }

    @Override
    public void showStatus() {
        System.out.println("Arrived to destination country, not received by client");
    }
}
