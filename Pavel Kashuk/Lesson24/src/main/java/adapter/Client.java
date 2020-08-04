package adapter;

public class Client {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase(new JavaApplication());

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
