package abstractf;

public class VAGPickup implements Pickup {

    private final String TRADEMARK = "Volkswagen";
    private String type;

    public VAGPickup() {
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
