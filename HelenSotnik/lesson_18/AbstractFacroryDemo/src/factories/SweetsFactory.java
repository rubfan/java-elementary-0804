package abstractfactory.factories;

import abstractfactory.candy.Candy;
import abstractfactory.chocolate.Chocolate;

public interface SweetsFactory {
    Chocolate createChocolate();

    Candy createCandy();
}
