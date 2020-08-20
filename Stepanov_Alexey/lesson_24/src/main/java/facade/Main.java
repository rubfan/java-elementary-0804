package facade;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        Connection connection = new Connection();
        Login login = new Login();
        Permission permission = new Permission();
        Default aDefault = new Default();

        Facade facade = new Facade(session, connection, login, permission, aDefault);
        facade.start();
    }
}
/* output
New session started
Connection established...
You entered to database...
Permission for changes granted...
Default data set prepared...
 */
