package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List statesList = new ArrayList();

    public void addMemento(Memento memento) {
        this.statesList.add(memento);
    }

    public Memento getMemento(int index) {
        return (Memento)statesList.get(index);
    }
}
