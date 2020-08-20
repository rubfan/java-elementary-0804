package strategy;

public class SeniorAssociateBonus implements BonusDistributionStrategy {
    private int annualBonus;
    private int mentoringBonus;

    public SeniorAssociateBonus(int annualBonus, int mentoringBonus) {
        this.annualBonus = annualBonus;
        this.mentoringBonus = mentoringBonus;
    }

    public int getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus) {
        this.annualBonus = annualBonus;
    }

    public int getMentoringBonus() {
        return mentoringBonus;
    }

    public void setMentoringBonus(int mentoringBonus) {
        this.mentoringBonus = mentoringBonus;
    }

    @Override
    public int calculateBonus(int dealProfit, int bonusPercent) {
        return dealProfit * bonusPercent / 100 + getMentoringBonus() + getAnnualBonus();
    }
}
