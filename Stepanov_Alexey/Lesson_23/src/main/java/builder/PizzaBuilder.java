package builder;

public class PizzaBuilder {
    private String base;
    private String sauce;
    private int size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean pineapple = false;
    private boolean chicken = false;

    public PizzaBuilder(String base, String sauce, int size) {
        this.base = base;
        this.sauce = sauce;
        this.size = size;
    }

    public PizzaBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
        return this;
    }

    public PizzaBuilder setChicken(boolean chicken) {
        this.chicken = chicken;
        return this;
    }

    public Pizza build() {
        return new Pizza(base, sauce, size, cheese, pepperoni, pineapple, chicken);
    }
}
