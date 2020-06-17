public class Profitability {
    final static int DAYS_YEAR = 365;

    public static void main(String[] args) {
        Farm farm = setFarmParameters();
        EconomicIndicators indicators = setEconomicIndicators();
        int result = profitabilityEvaluation(farm, indicators);
        String grade;
        if (result < 0) {
            grade = "INPUT PARAMS ARE INCORRECT";
        } else if (result < 1) {
            grade = "NOT PROFITABLE";
        } else if (result < 3) {
            grade = "PROFITABLE";
        } else {
            grade = "SUPER PROFITABLE";
        }
        System.out.println(grade.contains("INCORRECT") ? "INPUT PARAMS ARE INCORRECT" :
                "Farms to buy: " + result + "\n" + grade);
    }

    public static Farm setFarmParameters() {
        Farm farm = new Farm();
        farm.setCowCount(75);
        farm.setMilkProductionPerCow(4.5f);
        farm.setCowFoodConsumption(5.5f);
        return farm;
    }

    public static EconomicIndicators setEconomicIndicators() {
        EconomicIndicators indicators = new EconomicIndicators();
        indicators.setFarmBuyPrice(600);
        indicators.setMilkSellPrice(7.5f);
        indicators.setCowFoodBuyPrice(1.5f);
        indicators.setProfitTaxRate(15);
        indicators.setSalaryFromProfitAfterTaxRate(7.5f);
        return indicators;
    }

    public static int profitabilityEvaluation(Farm farm, EconomicIndicators indicators) {
        if (farm.inputCheck() && indicators.inputCheck()) {
            float profit = profitAfterTax(farm, indicators);
            if (profit < 0) {
                profit = 0;
            }
            return (int) (profit / indicators.getFarmBuyPrice());
        } else {
            return -1;
        }
    }

    public static float profitAfterTax(Farm farm, EconomicIndicators indicators) {
        float revenue = revenue(farm, indicators);
        float productionCosts = directRaw(farm, indicators) + directSalary(farm, indicators);
        float profitTax = indicators.getProfitTaxRate() / 100;
        return (revenue - productionCosts) * (1 - profitTax);
    }

    private static float revenue(Farm farm, EconomicIndicators indicators) {
        return farm.getCowCount() * farm.getMilkProductionPerCow() * indicators.getMilkSellPrice() * DAYS_YEAR;
    }

    private static float directRaw(Farm farm, EconomicIndicators indicators) {
        return farm.getCowCount() * farm.getCowFoodConsumption() * indicators.getCowFoodBuyPrice() * DAYS_YEAR;
    }

    public static float directSalary(Farm farm, EconomicIndicators indicators) {
        float revenue = revenue(farm, indicators);
        float margin = revenue - directRaw(farm, indicators);
        float salaryRate = indicators.getSalaryFromProfitAfterTaxRate() / 100;
        float profitTax = indicators.getProfitTaxRate() / 100;
        return (margin * salaryRate) / (1 / (1 - profitTax) + salaryRate);
    }
}