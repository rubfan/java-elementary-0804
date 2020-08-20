package memento;

public class LocalRepo {
    private Saver saver;

    public Saver getSaver() {
        return this.saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }
}
