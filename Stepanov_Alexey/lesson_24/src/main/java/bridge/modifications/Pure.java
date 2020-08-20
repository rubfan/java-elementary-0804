package bridge.modifications;

public class Pure extends Standard{
    private boolean mechanicalGears;

    public Pure(String comfort, String colour, boolean mechanicalGears) {
        super(comfort, colour);
        this.mechanicalGears = mechanicalGears;
    }

    public boolean isMechanicalGears() {
        return mechanicalGears;
    }

    public void setMechanicalGears(boolean mechanicalGears) {
        this.mechanicalGears = mechanicalGears;
    }
}
