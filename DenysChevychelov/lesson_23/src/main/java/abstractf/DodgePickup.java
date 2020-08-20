package abstractf;

public class DodgePickup implements Pickup {
    private final String TRADEMARK = "Dodge";
    private String type;

    public DodgePickup() {
        setTypePickup();
    }

    public void setTypePickup() {
        this.type = "Pickup";
    }

    @Override
    public String toString() {
        return "DodgePickup{" +
                "TRADEMARK='" + TRADEMARK + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
