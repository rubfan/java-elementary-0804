package command;

abstract class Command{
    Engine engine;

    public Command(Engine engine) {
        this.engine = engine;
    }

    public abstract void execute();
}
