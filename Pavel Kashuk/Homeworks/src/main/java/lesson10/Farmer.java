package lesson10;

public class Farmer {

    private double payTax;
    private double paySalaryToStaff;
    private double priceMilkForSell;
    private double priceFeedForPurchase;

    public void setPayTax(double payTax) {
        this.payTax = payTax;
    }

    public double getPayTax() {
        return payTax;
    }

    public void setPaySalaryToStaff(double paySalaryToStaff) {
        this.paySalaryToStaff = paySalaryToStaff;
    }

    public double getPaySalaryToStaff() {
        return paySalaryToStaff;
    }

    public void setPriceMilkForSell(double priceMilkForSell) {
        this.priceMilkForSell = priceMilkForSell;
    }

    public double getPriceMilkForSell() {
        return priceMilkForSell;
    }

    public void setPriceFeedForPurchase(double priceFeedForPurchase) {
        this.priceFeedForPurchase = priceFeedForPurchase;
    }

    public double getPriceFeedForPurchase() {
        return priceFeedForPurchase;
    }
}
