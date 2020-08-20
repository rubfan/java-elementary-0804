package proxy;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new ServiceLogin());
        User testUser = new User("Alex", "777");
        proxy.enter(testUser);
    }
}
