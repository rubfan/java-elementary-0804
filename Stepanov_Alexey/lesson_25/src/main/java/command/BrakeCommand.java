package command;

public class BrakeCommand extends Command {
    public BrakeCommand(Engine engine) {
        super(engine);
    }

    public void execute() {
        engine.brake();
    }
}
