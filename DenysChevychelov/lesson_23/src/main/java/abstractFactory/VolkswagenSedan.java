package abstractFactory;

public class VolkswagenSedan implements Sedan {
    private final String TRADEMARK = "Volkswagen";
    private String type;

    public VolkswagenSedan() {
        setTypeSedan();
    }

    public void setTypeSedan() {
        this.type = "Sedan";
    }

    @Override
    public String toString() {
        return "VolkswagenSedan{" +
                "TRADEMARK='" + TRADEMARK + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
