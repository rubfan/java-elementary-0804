package strategy;

public class ExecutiveDirectorBonus implements BonusDistributionStrategy {
    private int annualDirectorBonus;

    public ExecutiveDirectorBonus(int annualDirectorBonus) {
        this.annualDirectorBonus = annualDirectorBonus;
    }

    public int getAnnualDirectorBonus() {
        return annualDirectorBonus;
    }

    public void setAnnualDirectorBonus(int annualDirectorBonus) {
        this.annualDirectorBonus = annualDirectorBonus;
    }

    @Override
    public int calculateBonus(int dealProfit, int bonusPercent) {
        return dealProfit * bonusPercent / 100 + getAnnualDirectorBonus();
    }
}
