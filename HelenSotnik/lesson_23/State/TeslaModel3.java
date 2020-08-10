package state;

public class TeslaModel3 {
    private TeslaModel3Status status = new PreOrdered();

    public TeslaModel3Status getStatus() {
        return status;
    }

    public void setStatus(TeslaModel3Status status) {
        this.status = status;
    }

    public void previousStatus() {
        status.previousStatus(this);
    }

    public void nextStatus() {
        status.nextStatus(this);
    }

    public void showStatus() {
        status.showStatus();
    }
}
