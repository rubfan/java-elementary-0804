package memento;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.increase(30);
        System.out.println("Initial: " + engine.getState());

        Keeper keeper = new Keeper();
        keeper.save(engine.save());

        engine.decrease(70);
        engine.increase(10);
        System.out.println("After change: " + engine.getState());

        engine.load(keeper.load());
        System.out.println("After restore: " + engine.getState());
    }
}
