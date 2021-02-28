package command;

public class UpdateCommand {

    private Database database;

    public UpdateCommand( Database database) {
        this.database = database;
    }

    public void execute() {
        this.database.update();
    }
}
