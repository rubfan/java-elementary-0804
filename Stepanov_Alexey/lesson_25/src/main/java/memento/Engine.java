package memento;

public class Engine {
    private int power = 50;

    public int getState() {
        return power;
    }

    public void increase(int value) {
        power = power + value;
    }

    public void decrease(int value) {
        power = power - value;
    }

    public Memento save() {
        return new Memento(power);
    }

    public void load(Memento memento) {
        power = memento.getState();
    }
}
