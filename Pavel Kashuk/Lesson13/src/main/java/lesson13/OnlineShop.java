package lesson13;
/*
Создать несколько объектов класса lesson13.Category
Создать объект класса lesson13.User. Интернет магазин)
 */
public class OnlineShop {
    public static void main(String[] args) {

        Category firstCategory = new Category("TV");
        firstCategory.setProducts(new Product("LG TV", 1000, 9.5),
                new Product("Sony TV", 2000, 8.5),
                new Product("Samsung TV", 1500, 9.0));

        Category secondCategory = new Category("Washer Machine");
        secondCategory.setProducts(new Product("Samsungc Washer", 1500, 9.0),
                new Product("LG Washer", 2500, 9.5),
                new Product("Philips Washer", 2000, 8.5));

        User user = new User("login", "password");
        user.setUserBasket(new Basket(new Product("Iphone11", 3000, 10.0)));

        User user2 = new User("111", "222");
        user2.setUserBasket(new Basket(secondCategory.getProducts()));

        System.out.println(firstCategory + "\n" + secondCategory);
        System.out.println(user + "\n" + user2);
    }
}
