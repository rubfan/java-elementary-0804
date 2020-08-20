package structure;

public class InternetShop {
    public static void main(String[] args) {

        Product pasta = new Product("Barilla", 45.6, "****");
        Product cornFlakes = new Product("Nestle", 33.89, "*****");
        Product milk = new Product("Buryonka", 32.0, "***");
        Product chickenWings = new Product("Riaba", 87.99, "***");
        Product chocolate = new Product("Mars", 19.75, "***");
        Product whiteChocolate = new Product("Millenium", 25.5, "**");
        Product yogurt = new Product("Dolche", 40.99, "*****");

        Category category1 = new Category("Grocery");
        Product[] groceryProducts = {pasta, cornFlakes};
        category1.setProducts(groceryProducts);

        Category category2 = new Category("Sweets");
        Product[] sweets = {chocolate, whiteChocolate};
        category2.setProducts(sweets);

        Category category3 = new Category("Meat");
        Product[] meat = {chickenWings};
        category3.setProducts(meat);

        Category category4 = new Category("Milk_Products");
        Product[] milkProducts = {milk, yogurt};
        category4.setProducts(milkProducts);

        Product[] productsInBasket = {milk, whiteChocolate, pasta, chickenWings};
        Basket newBasket = new Basket(productsInBasket);

        User user1 = new User("Mandy", "52524421hjj", newBasket);

        System.out.println("User1" + user1 + "\n");
        System.out.println(category1 + "\n");
        System.out.println(category2 + "\n");
        System.out.println(category3 + "\n");
        System.out.println(category4 + "\n");
    }
}
