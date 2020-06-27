package lesson13;
/*
Создать класс lesson13.User, содержащий логин, пароль и объект класса lesson13.Basket.
*/
public class User {

    private String userLogin;
    private String userPassword;
    private Basket userBasket;

    public User(String login, String password) {
        this.userLogin = login;
        this.userPassword = password;
    }

    public String getLogin() {
        return this.userLogin;
    }

    public void setLogin(String login) {
        this.userLogin = login;
    }

    public String getPassword() {
        return this.userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public Basket getUserBasket() {
        return this.userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    @Override
    public String toString() {
        return "lesson13.User{" +
                "userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBasket=" + userBasket +
                '}';
    }
}
