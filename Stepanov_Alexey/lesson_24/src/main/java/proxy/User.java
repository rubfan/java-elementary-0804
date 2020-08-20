package proxy;

public class User {
    private final String name;
    private final String pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public boolean validate(String password) {
        if (password.equals(this.pass)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
