package abstractFactory;

public class VolkswagenPickup implements Pickup {
    private final String TRADEMARK = "Volkswagen";
    private String type;

    public VolkswagenPickup() {
        setTypePickup();
    }

    public void setTypePickup() {
        this.type = "Pickup";
    }

    @Override
    public String toString() {
        return "VolkswagenPickup{" +
                "TRADEMARK='" + TRADEMARK + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
