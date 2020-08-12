package command;

public class StartCommand extends Command{

    public StartCommand(Engine engine) {
        super(engine);
    }

    public void execute() {
        engine.start();
    }
}
