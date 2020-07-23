package command;

public class BodyWasher implements Command {
    private CarWash carWash;

    public BodyWasher(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void execute() {
        this.carWash.washBody();
    }
}
