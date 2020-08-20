package abstractfactory;

import abstractfactory.candy.Candy;
import abstractfactory.chocolate.Chocolate;
import abstractfactory.factories.SweetsFactory;

public class Application {
    private Chocolate chocolate;
    private Candy candy;

    public Application(SweetsFactory factory) {
        chocolate = factory.createChocolate();
        candy = factory.createCandy();
    }

    public void addIngredients() {
        chocolate.addIngredients();
        candy.addIngredients();
    }
}
