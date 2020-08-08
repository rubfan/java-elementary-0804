package command;

public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    public void execute() {
        this.database.delete();
    }
}
