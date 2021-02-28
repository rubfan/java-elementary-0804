public class Farm {
    private float farmPrice;
    private float percentIncomeTax;
    private float percentSalaryToMilkmaids;
    private int numberOfCows;
    Cow cows = new Cow();

    public String calculateFarmProfit() {
        float revenueOfAllCows = calculateYearlyAllCowsRevenue();
        float revenueAfterTax = calculateYearlyRevenueAfterTax(revenueOfAllCows);
        float revenueAfterSalary = calculateYearlyRevenueAfterSalary(revenueAfterTax);
        String farmProfit = calculateChanceBuyNewFarms(revenueAfterSalary);
        return farmProfit;
    }

    public String calculateChanceBuyNewFarms(float revenue) {
        String farmsNumber;
        int farmsNumb = (int) (revenue / farmPrice);
        if (farmsNumb > 3) {
            System.out.println("You can buy " + farmsNumb + " farms.");
            farmsNumber = "SUPER PROFITABLE";
        } else if (farmsNumb >= 1) {
            System.out.println("You can buy " + farmsNumb + " farms.");
            farmsNumber = "PROFITABLE";
        } else {
            System.out.println("You can not buy farms.");
            farmsNumber = "NOT PROFITABLE";
        }
        System.out.println(farmsNumber);
        return farmsNumber;
    }

    public float calculateYearlyRevenueAfterSalary(float revenue) {
        revenue -= revenue * percentSalaryToMilkmaids / 100;
        return revenue;
    }

    public float calculateYearlyRevenueAfterTax(float revenue) {
        revenue -= revenue * percentIncomeTax / 100;
        return revenue;
    }

    public float calculateYearlyAllCowsRevenue() {
        float revenue = cows.calculateYearlyCowRevenue() * numberOfCows;
        return revenue;
    }


    protected boolean paramsLimitsChecking(int lowerLimit, int upperLimit, float parameter) {
        if (parameter < lowerLimit || parameter > upperLimit) {
            return false;
        } else {
            return true;
        }
    }

    public String setFarmParams(float farmPrice, float percentIncomeTax, float percentSalaryToMilkmaids) {
        String result;
        if (paramsLimitsChecking(500, 1000, farmPrice)
                && paramsLimitsChecking(10, 20, percentIncomeTax)
                && paramsLimitsChecking(5, 10, percentSalaryToMilkmaids)) {
            this.farmPrice = farmPrice;
            this.percentIncomeTax = percentIncomeTax;
            this.percentSalaryToMilkmaids = percentSalaryToMilkmaids;
            result = "";
        } else {
            result = "INPUT PARAMS ARE INCORRECT.";
            System.out.println(result);
        }
        return result;
    }

    public String setCowParams(int numberOfCows, float cowFoodConsumption, float cowFoodPrise,
                               float cowMilkProduction, float cowMilkPrice) {
        String result;
        if (paramsLimitsChecking(50, 100, numberOfCows)
                && paramsLimitsChecking(5, 10, cowFoodConsumption)
                && paramsLimitsChecking(1, 3, cowFoodPrise)
                && paramsLimitsChecking(1, 5, cowMilkProduction)
                && paramsLimitsChecking(5, 10, cowMilkPrice)) {
            this.cows.setCowFoodPrise(cowFoodPrise);
            this.cows.setCowMilkPrice(cowMilkPrice);
            this.cows.setCowMilkProduction(cowMilkProduction);
            this.cows.setCowFoodConsumption(cowFoodConsumption);
            this.numberOfCows = numberOfCows;
            result = "";
        } else {
            result = "INPUT PARAMS ARE INCORRECT.";
            System.out.println(result);
        }
        return result;
    }

    public float getFarmPrice() {
        return farmPrice;
    }

    public float getPercentIncomeTax() {
        return percentIncomeTax;
    }

    public float getPercentSalaryToMilkmaids() {
        return percentSalaryToMilkmaids;
    }

    public int getNumberOfCows() {
        return numberOfCows;
    }
}
