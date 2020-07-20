package abstractFactory;

public class VolkswagenFactory implements Factory {
    public Sedan createSedan() {
        return new VolkswagenSedan();
    }

    public Pickup createPickup() {
        return new VolkswagenPickup();
    }
}
