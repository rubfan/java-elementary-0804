package abstractf;

public class DodgeFactory implements Factory {
    public Sedan createSedan() {
        return new DodgeSedan();
    }

    public Pickup createPickup() {
        return new DodgePickup();
    }
}
