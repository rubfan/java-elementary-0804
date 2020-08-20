package command;

public class StopCommand extends Command {

    public StopCommand(Engine engine) {
        super(engine);
    }

    public void execute() {
        engine.stop();
    }
}
