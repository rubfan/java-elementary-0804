package command;

public class BackwardCommand implements Command {
    private Car car;

    public BackwardCommand(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.moveBackward();
    }
}
