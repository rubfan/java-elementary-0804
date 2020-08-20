package state;

public class PreOrdered implements TeslaModel3Status {
    @Override
    public void previousStatus(TeslaModel3 tesla) {
        System.out.println("Model 3 pre-order placement on https://www.tesla.com and pre-payment $1000");
    }

    @Override
    public void nextStatus(TeslaModel3 tesla) {
        tesla.setStatus(new Manufactured());
    }

    @Override
    public void showStatus() {
        System.out.println("Model 3 pre-ordered");
    }
}
