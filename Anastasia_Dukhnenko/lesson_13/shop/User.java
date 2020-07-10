package shop;

public class User {
    private String login;
    private String password;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
    }
}
