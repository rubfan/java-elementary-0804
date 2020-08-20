package builder;

public class Main {
    public static void main(String[] args) {
        Pizza classic = new PizzaBuilder("Slim", "Red", 12)
                .setCheese(true)
                .setChicken(false)
                .setPepperoni(false)
                .setPineapple(false)
                .build();

        Pizza hawaii = new PizzaBuilder("Thick", "White", 18)
                .setCheese(false)
                .setChicken(true)
                .setPineapple(true)
                .build();
    }
}
