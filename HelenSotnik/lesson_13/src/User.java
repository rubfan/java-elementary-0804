package structure;

public class User {
    private String login;
    private String password;
    private Basket basket;

    protected User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    protected String getLogin() {
        return login;
    }

    protected void setLogin(String log) {
        this.login = log;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String pw) {
        this.password = pw;
    }

    protected Basket getBasket() {
        return basket;
    }

    protected void setBasket(Basket b) {
        this.basket = b;
    }

    @Override
    public String toString() {
        return "{" +
                "login=" + login + '\"' +
                ", password=" + password + '\"' + "}\n" +
                "In your basket:" + basket;
    }
}
