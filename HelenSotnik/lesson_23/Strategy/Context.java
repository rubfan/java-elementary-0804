package strategy;

public class Context {
    BonusDistributionStrategy strategy;

    public Context(BonusDistributionStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int profit, int bonusPercent){
        return strategy.calculateBonus(profit,bonusPercent);
    }
}
