package memento;

public class Saver {
    private final String creator;
    private final String version;

    public Saver(String creator, String version) {
        this.creator = creator;
        this.version = version;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getVersion() {
        return this.version;
    }
}
