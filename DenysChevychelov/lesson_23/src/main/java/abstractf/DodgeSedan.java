package abstractf;

public class DodgeSedan implements Sedan {
    private final String TRADEMARK = "Dodge";
    private String type;

    public DodgeSedan() {
        setTypeSedan();
    }

    public void setTypeSedan() {
        this.type = "Sedan";
    }

    @Override
    public String toString() {
        return "DodgeSedan{" +
                "TRADEMARK='" + TRADEMARK + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
