package state;

public class AutomaticCarWasher {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void changeOperation() {
        if (operation instanceof Rest) {
            setOperation(new ShampooHandler());
        } else if (operation instanceof ShampooHandler) {
            setOperation(new TimeoutStarter());
        } else if (operation instanceof TimeoutStarter) {
            setOperation(new Washer());
        } else if (operation instanceof Washer) {
            setOperation(new Dryer());
        } else if (operation instanceof Dryer) {
            setOperation(new Rest());
        }
    }

    public void doOperation() {
        this.operation.doOperation();
    }
}
