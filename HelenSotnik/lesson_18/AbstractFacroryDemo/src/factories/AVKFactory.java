package abstractfactory.factories;

import abstractfactory.candy.AVKCandy;
import abstractfactory.candy.Candy;
import abstractfactory.chocolate.AVKChocolate;
import abstractfactory.chocolate.Chocolate;

public class AVKFactory implements SweetsFactory {
    public Chocolate createChocolate() {
        return new AVKChocolate();
    }

    public Candy createCandy() {
        return new AVKCandy();
    }
}
