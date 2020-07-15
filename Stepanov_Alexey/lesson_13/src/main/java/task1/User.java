package task1;

public class User {
    private String userName;
    private String login;
    private String pass;
    private Basket basket;

    public User(String userName, String login, String pass, Basket basket) {
        this.userName = userName;
        this.login = login;
        this.pass = pass;
        this.basket = basket;
    }
}
