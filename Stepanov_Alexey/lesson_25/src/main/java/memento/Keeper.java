package memento;


public class Keeper {
    private Memento memento;

    public Memento load() {
        return memento;
    }

    public void save(Memento newMemento) {
        memento = newMemento;
    }
}