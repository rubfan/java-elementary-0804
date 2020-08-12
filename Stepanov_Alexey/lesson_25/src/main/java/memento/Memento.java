package memento;

public class Memento {
    private int power;

    public Memento(int newPower) {
        power = newPower;
    }

    public int getState() {
        return power;
    }
}
