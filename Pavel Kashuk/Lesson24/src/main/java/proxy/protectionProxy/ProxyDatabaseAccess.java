package proxy.protectionProxy;

public class ProxyDatabaseAccess implements DatabaseAccess {
    private User user;

    public ProxyDatabaseAccess(User user) {
        this.user = user;
    }

    public void provideAccess() {
        RealDatabaseAccess access;

        if (isUser()) {
            access = new RealDatabaseAccess(user);
            access.provideAccess();
        } else if (isAdmin()) {
            access = new RealDatabaseAccess(user);
            access.provideAccess();
        } else {
            System.out.printf("Access denied: %s%n", user.getCategory());
        }
    }

    private boolean isUser() {
        return user.getCategory().equalsIgnoreCase("user");
    }

    private boolean isAdmin() {
        return user.getCategory().equalsIgnoreCase("admin");
    }
}
