package proxy;

public class ServiceLogin implements Login {
    public void enter(User user) {
            System.out.println("Welcome " + user.getName());
    }
}
