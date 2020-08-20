package command;

public class ForwardCommand implements Command {
    private Car car;

    public ForwardCommand(Car car) {
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
        car.moveForward();
    }
}
