package abstractf;

public class AbstractCarFactory implements Factory {
    private Factory factory;

    public AbstractCarFactory(Factory factory) {
        this.factory = factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Sedan createSedan() {
        return this.factory.createSedan();
    }

    public Pickup createPickup() {
        return this.factory.createPickup();
    }
}
