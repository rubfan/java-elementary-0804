package command;

public class WindowsRubber implements Command {
    private CarWash carWash;

    public WindowsRubber(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void execute() {
        this.carWash.rubWindows();
    }
}
