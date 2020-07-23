package command;

public class SalonWasher implements Command {
    private CarWash carWash;

    public SalonWasher(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void execute() {
        this.carWash.washSalon();
    }
}
