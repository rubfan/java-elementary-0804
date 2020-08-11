package strategy;

public class DefensiveStrategy implements Strategy {
    @Override
    public void actionCommand() {
        System.out.println("Defensive strategy. Protect self and teammates");
    }
}
