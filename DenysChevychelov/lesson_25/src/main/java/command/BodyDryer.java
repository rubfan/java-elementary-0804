package command;

public class BodyDryer implements Command {
    private CarWash carWash;

    public BodyDryer(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void execute() {
        this.carWash.dryBody();
    }
}
