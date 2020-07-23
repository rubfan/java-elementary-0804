package memento;

public class TextDocument {
    private String creator;
    private String version;

    public void setCreatorAndVersion(String creator, String version) {
        this.creator = creator;
        this.version = version;
    }

    public Saver save() {
        return new Saver(this.creator, this.version);
    }

    public void restore(Saver saver) {
        this.creator = saver.getCreator();
        this.version = saver.getVersion();
    }

    @Override
    public String toString() {
        return "TextDocument{" +
                "creator='" + this.creator + '\'' +
                ", version='" + this.version + '\'' +
                '}';
    }
}
