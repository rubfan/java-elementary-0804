package abstractfactory.factories;

import abstractfactory.candy.Candy;
import abstractfactory.candy.RoshenCandy;
import abstractfactory.chocolate.Chocolate;
import abstractfactory.chocolate.RoshenChocolate;

public class RoshenFactory implements SweetsFactory {
    public Chocolate createChocolate() {
        return new RoshenChocolate();
    }

    public Candy createCandy() {
        return new RoshenCandy();
    }
}
