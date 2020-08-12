package command;

public class WheelLeftCommand implements Command {
    private Car car;

    public WheelLeftCommand(Car car) {
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
        car.turnLeft();
    }
}
