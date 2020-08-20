package proxy.protectionProxy;

public class Client {
    public static void main(String[] args) {
        User user = new User("user");
        DatabaseAccess userAccess = new ProxyDatabaseAccess(user);
        userAccess.provideAccess();

        User admin = new User("admin");
        DatabaseAccess adminAccess = new ProxyDatabaseAccess(admin);
        adminAccess.provideAccess();

        User guest = new User("guest");
        DatabaseAccess guestAccess = new ProxyDatabaseAccess(guest);
        guestAccess.provideAccess();
    }
}
