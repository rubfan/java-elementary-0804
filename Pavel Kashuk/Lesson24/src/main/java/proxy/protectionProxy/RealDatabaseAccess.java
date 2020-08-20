package proxy.protectionProxy;

public class RealDatabaseAccess implements DatabaseAccess {
    private User user;

    public RealDatabaseAccess(User user) {
        this.user = user;
    }

    public void provideAccess() {
        System.out.printf("Access confirmed: %s%n", user.getCategory());
    }
}
