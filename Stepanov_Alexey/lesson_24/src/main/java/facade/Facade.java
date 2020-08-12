package facade;

public class Facade {
    private Session session;
    private Connection connection;
    private Login login;
    private Permission permission;
    private Default aDefault;

    public Facade(Session session, Connection connection, Login login, Permission permission, Default aDefault) {
        this.session = session;
        this.connection = connection;
        this.login = login;
        this.permission = permission;
        this.aDefault = aDefault;
    }

    public void start() {
        session.start();
        connection.connect();
        login.enter();
        permission.enabled();
        aDefault.dataSet();
    }
}
