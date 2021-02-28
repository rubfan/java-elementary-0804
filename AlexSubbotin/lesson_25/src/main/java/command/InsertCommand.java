package command;

public class InsertCommand implements Command {

    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }
    public void execute() {
        this.database.insert();
    }
}
