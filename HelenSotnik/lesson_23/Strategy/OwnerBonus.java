package strategy;

public class OwnerBonus implements BonusDistributionStrategy {
    public int jointStockBonus;

    public OwnerBonus(int jointStockBonus) {
        this.jointStockBonus = jointStockBonus;
    }

    public int getJointStockBonus() {
        return jointStockBonus;
    }

    public void setJointStockBonus(int jointStockBonus) {
        this.jointStockBonus = jointStockBonus;
    }

    @Override
    public int calculateBonus(int dealProfit, int bonusPercent) {
        return dealProfit * bonusPercent / 100 + getJointStockBonus();
    }
}
