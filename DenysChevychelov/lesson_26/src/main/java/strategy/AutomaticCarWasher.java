package strategy;

public class AutomaticCarWasher {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void doOperation() {
        this.operation.doOperation();
    }
}
