package abstractf;

public class VAGSedan implements Sedan {

    private final String TRADEMARK = "Volkswagen";
    private String type;

    public VAGSedan() {
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
