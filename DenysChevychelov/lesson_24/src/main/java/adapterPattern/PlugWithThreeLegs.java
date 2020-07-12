package adapterPattern;

public class PlugWithThreeLegs {
    private PlugAdapter plugAdapter;

    public PlugWithThreeLegs(PlugAdapter plugAdapter) {
        this.plugAdapter = plugAdapter;
    }

    public void insertPlug() {
        this.plugAdapter.plugIntoSocket();
    }
}
