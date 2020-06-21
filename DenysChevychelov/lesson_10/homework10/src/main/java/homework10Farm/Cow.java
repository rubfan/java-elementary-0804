package homework10Farm;

public class Cow {
    public final int DAYS_IN_YEAR = 365;
    private float cowMilkProduction;
    private float cowFoodConsumption;
    private float cowFoodPrise;
    private float cowMilkPrice;

    protected float calculateYearlyCowRevenue() {
        float revenue = (this.cowMilkProduction * this.cowMilkPrice
                - this.cowFoodConsumption * this.cowFoodPrise) * DAYS_IN_YEAR;
        return revenue;
    }

    public float getCowMilkProduction() {
        return cowMilkProduction;
    }

    protected void setCowMilkProduction(float cowMilkProduction) {
        this.cowMilkProduction = cowMilkProduction;
    }

    public float getCowFoodConsumption() {
        return cowFoodConsumption;
    }

    protected void setCowFoodConsumption(float cowFoodConsumption) {
        this.cowFoodConsumption = cowFoodConsumption;
    }

    public float getCowFoodPrise() {
        return cowFoodPrise;
    }

    protected void setCowFoodPrise(float cowFoodPrise) {
        this.cowFoodPrise = cowFoodPrise;
    }

    public float getCowMilkPrice() {
        return cowMilkPrice;
    }

    protected void setCowMilkPrice(float cowMilkPrice) {
        this.cowMilkPrice = cowMilkPrice;
    }
}
