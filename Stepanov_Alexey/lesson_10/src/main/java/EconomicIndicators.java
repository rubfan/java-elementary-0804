public class EconomicIndicators {
    private float farmBuyPrice;
    private float cowFoodBuyPrice;
    private float milkSellPrice;
    private float profitTaxRate;
    private float salaryFromProfitAfterTaxRate;

    public float getFarmBuyPrice() {
        return farmBuyPrice;
    }

    public void setFarmBuyPrice(float farmBuyPrice) {
        this.farmBuyPrice = farmBuyPrice;
    }

    public float getCowFoodBuyPrice() {
        return cowFoodBuyPrice;
    }

    public void setCowFoodBuyPrice(float cowFoodBuyPrice) {
        this.cowFoodBuyPrice = cowFoodBuyPrice;
    }

    public float getMilkSellPrice() {
        return milkSellPrice;
    }

    public void setMilkSellPrice(float milkSellPrice) {
        this.milkSellPrice = milkSellPrice;
    }

    public float getProfitTaxRate() {
        return profitTaxRate;
    }

    public void setProfitTaxRate(float profitTaxRate) {
        this.profitTaxRate = profitTaxRate;
    }

    public float getSalaryFromProfitAfterTaxRate() {
        return salaryFromProfitAfterTaxRate;
    }

    public void setSalaryFromProfitAfterTaxRate(float salaryFromProfitAfterTaxRate) {
        this.salaryFromProfitAfterTaxRate = salaryFromProfitAfterTaxRate;
    }

    public boolean inputCheck() {
        if (checkBounds(farmBuyPrice, 500, 1000) &&
                checkBounds(cowFoodBuyPrice, 1, 3) &&
                checkBounds(milkSellPrice, 5, 10) &&
                checkBounds(profitTaxRate, 10, 20) &&
                checkBounds(salaryFromProfitAfterTaxRate, 5, 10)) {
            return true;
        }
        return false;
    }
    private static boolean checkBounds(double value, int min, int max) {
        return value >= min && value <= max;
    }
}
