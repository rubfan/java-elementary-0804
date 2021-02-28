package strategy;

public class AggressiveStrategy implements Strategy {

    @Override
    public void actionCommand() {
        System.out.println("Aggressive strategy. Find and kill opponent");
    }
}
