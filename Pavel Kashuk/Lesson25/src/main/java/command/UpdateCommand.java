package command;

public class UpdateCommand implements Command {
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    public void execute() {
        this.database.update();
    }
}
