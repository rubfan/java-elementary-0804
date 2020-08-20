package abstractfactory;

import abstractfactory.factories.AVKFactory;
import abstractfactory.factories.RoshenFactory;
import abstractfactory.factories.SweetsFactory;

public class AbstractFactoryDemo {
    private static Application configureApplication(String sweetsName) {
        SweetsFactory factory;
        if (sweetsName.contains("roshen")) {
            factory = new RoshenFactory();
        } else {
            factory = new AVKFactory();
        }
        Application app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication("roshen");
        app.addIngredients();

        app = configureApplication("avk");
        app.addIngredients();
    }
}
