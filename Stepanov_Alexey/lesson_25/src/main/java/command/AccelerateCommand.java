package command;

public class AccelerateCommand extends Command{

    public AccelerateCommand(Engine engine) {
        super(engine);
    }

    public void execute() {
        engine.accelerate();
    }
}
