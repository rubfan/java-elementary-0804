package command;

public class WheelRightCommand implements Command {
    private Car car;

    public WheelRightCommand(Car car) {
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
        car.turnRight();
    }
}
