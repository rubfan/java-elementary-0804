package strategy;

public class CounterStrike {
    public static void main(String[] args) {
        Player terrorist = new Player("Terrorist");
        Player counter_Terrorist = new Player("Counter-Terrorist");

        System.out.println("Before bomb is planted");

        terrorist.setStrategy(new AggressiveStrategy());
        counter_Terrorist.setStrategy(new DefensiveStrategy());

        terrorist.action();
        counter_Terrorist.action();

        System.out.println("After bomb is planted");

        terrorist.setStrategy(new DefensiveStrategy());
        counter_Terrorist.setStrategy(new AggressiveStrategy());

        terrorist.action();
        counter_Terrorist.action();
    }
}
