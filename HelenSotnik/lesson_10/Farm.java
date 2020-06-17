package company;

public class Farm {

    public int cowsNumber, milkAmount, cormAmount, cormPrice, milkPrice;
    public int farmCost, taxPercent, salaryPercent;
    public final int daysInYear = 365;

    public void setFarmCost(int farmPrice) {
        if (farmPrice >= 500 && farmPrice <= 1000) {
            this.farmCost = farmPrice;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setCowsAmount(int cows) {
        if (cows >= 50 && cows <= 100) {
            this.cowsNumber = cows;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setMilkAmount(int milkLiters) {
        if (milkLiters >= 1 && milkLiters <= 5) {
            this.milkAmount = milkLiters;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setMilkPrice(int priceOfMilk) {
        if (priceOfMilk >= 5 && priceOfMilk <= 10) {
            this.milkPrice = priceOfMilk;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setCormAmount(int cormKg) {
        if (cormKg >= 5 && cormKg <= 10) {
            this.cormAmount = cormKg;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setPriceOfCorm(int priceOfCorm) {
        if (priceOfCorm >= 1 && priceOfCorm <= 3) {
            this.cormPrice = priceOfCorm;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setTaxPercentage(int tax) {
        if (tax >= 10 && tax <= 20) {
            this.taxPercent = tax;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public void setSalaryPercentage(int salaryPercentage) {
        if (salaryPercentage >= 5 && salaryPercentage <= 10) {
            this.salaryPercent = salaryPercentage;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
        }
    }

    public int feedCows() {
        return cowsNumber * cormAmount;
    }

    public int milkTheCows() {
        return cowsNumber * milkAmount;
    }

    public int calculateYearMilkProfit() {
        int dayProfit = milkTheCows() * milkPrice;
        int yearProfit = dayProfit * daysInYear;
        return yearProfit;
    }

    public int calculateYearFeedingExpenses() {
        int dayExpenses = feedCows() * cormPrice;
        int yearExpenses = dayExpenses * daysInYear;
        return yearExpenses;
    }

    public int calculateProfitMinusExpenses() {
        return calculateYearMilkProfit() - calculateYearFeedingExpenses();
    }

    public int payTaxes() {
        if (calculateProfitMinusExpenses() > 0) {
            return calculateProfitMinusExpenses() * taxPercent / 100;
        } else {
            return 0;
        }
    }

    public int calculateProfitAfterTaxPayment() {
        return calculateProfitMinusExpenses() - payTaxes();
    }

    public int paySalaries() {
        if (calculateProfitAfterTaxPayment() > 0) {
            return calculateProfitAfterTaxPayment() * salaryPercent / 100;
        } else {
            return 0;
        }
    }

    public int calculateNetProfit() {
        return calculateProfitAfterTaxPayment() - paySalaries();
    }

    public int calculateFarmsAmountToBuy() {
        if (farmCost > 0) {
            return calculateNetProfit() / farmCost;
        }
        return 0;
    }

    public String profitabilityOfFarm() {
        int farmToBuy = calculateFarmsAmountToBuy();
        String a = "\nCurrent year income allows to buy " + farmToBuy + " farms.";
        if (farmToBuy < 1) {
            return "NOT PROFITABLE";
        } else if (farmToBuy == 1) {
            return "PROFITABLE" + a;

        } else if (farmToBuy > 3) {
            return "SUPER PROFITABLE" + a;
        }
        return "";
    }
}
