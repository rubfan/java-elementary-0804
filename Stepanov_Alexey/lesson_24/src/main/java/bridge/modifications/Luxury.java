package bridge.modifications;

public class Luxury extends Standard{
    private boolean leatherSeats;

    public Luxury(String comfort, String colour, boolean leatherSeats) {
        super(comfort, colour);
        this.leatherSeats = leatherSeats;
    }

    public boolean isLeatherSeats() {
        return leatherSeats;
    }

    public void setLeatherSeats(boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }
}
