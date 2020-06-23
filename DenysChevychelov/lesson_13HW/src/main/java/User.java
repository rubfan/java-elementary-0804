import store.Product;

public class User {
    /*
    Создать класс User, содержащий логин, пароль и объект класса Basket.
    */
    private String login;
    private String password;
    private Basket userBasket;

    protected class Basket {
        /*
        Создать класс Basket, содержащий массив купленных товаров.
        */
        private Product[] boughtProducts;

        public Basket(Product... boughtProducts) {
            this.boughtProducts = boughtProducts;
        }

        public Product[] getBoughtProducts() {
            return this.boughtProducts;
        }

        public void setBoughtProducts(Product... boughtProducts) {
            this.boughtProducts = boughtProducts;
        }
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return this.userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }
}
