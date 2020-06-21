public class Farm {
    private int cowCount;
    private float milkProductionPerCow;
    private float cowFoodConsumption;

    public int getCowCount() {
        return cowCount;
    }

    public void setCowCount(int cowCount) {
        this.cowCount = cowCount;
    }

    public float getMilkProductionPerCow() {
        return milkProductionPerCow;
    }

    public void setMilkProductionPerCow(float milkProductionPerCow) {
        this.milkProductionPerCow = milkProductionPerCow;
    }

    public float getCowFoodConsumption() {
        return cowFoodConsumption;
    }

    public void setCowFoodConsumption(float cowFoodConsumption) {
        this.cowFoodConsumption = cowFoodConsumption;
    }

    public boolean inputCheck() {
        if (checkBounds(cowCount, 50, 100) &&
                checkBounds(milkProductionPerCow, 1, 5) &&
                checkBounds(cowFoodConsumption, 5, 10)) {
            return true;
        }
        return false;
    }

    private static boolean checkBounds(double value, int min, int max) {
        return value >= min && value <= max;
    }
}
