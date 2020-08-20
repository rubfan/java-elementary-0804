package command;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();

        Invoker developer = new Invoker(new InsertCommand(database), new UpdateCommand(database),
                new SelectCommand(database), new DeleteCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
