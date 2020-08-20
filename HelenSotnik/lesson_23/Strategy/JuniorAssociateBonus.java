package strategy;

public class JuniorAssociateBonus implements BonusDistributionStrategy {
    @Override
    public int calculateBonus(int dealProfit, int bonusPercent) {
        return dealProfit * bonusPercent / 100;
    }
}
