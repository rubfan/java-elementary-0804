package bridge.modifications;

public class Standard implements Modification{
    private String comfort;
    private String colour;

    public Standard(String comfort, String colour) {
        this.comfort = comfort;
        this.colour = colour;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
