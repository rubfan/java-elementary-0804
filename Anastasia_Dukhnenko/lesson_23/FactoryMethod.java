class BDay {
    public AbstractPresent give(Object object) {
        AbstractPresent present = null;
        if (object instanceof Jewerly) {
            present = new Jewerly();
        } else if (object instanceof Trip) {
            present = new Trip();
        }
        return present;
    }
}

abstract class AbstractPresent {
    public abstract void buy(Object present);
}

class Jewerly extends AbstractPresent {
    public void buy(Object present) {
        System.out.println("To buy some jewerly.");
    }
}

class Trip extends AbstractPresent {
    public void buy(Object present) {
        System.out.println("To buy some trip.");
    }
}



