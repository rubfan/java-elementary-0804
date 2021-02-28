package abstractf;

public class VAGFactory implements Factory {

    public Sedan createSedan() {
        return new VAGSedan();
    }

    public Pickup createPickup() {
        return new VAGPickup();
    }
}
