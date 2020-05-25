package homework10Farm;

public class Farm {
/*
Ферма стоит от $500 до $1000
На ферме находится от 50 до 100 коров
Каждая корова приностит от 1 до 5 литров молока в день
Каждая корова потребляет от 5 до 10 килограм корма в день
Килограм корма стоит от $1 до 3$
Продажа 1 литра молока приностит от $5 до 10$
Фермер платит налог от прибыли от 10% до 20%
Фермер платит зарплату дояркам от 5% до 10% от прибыли после уплаты налогов

Написать код которому на вход передаются все упомянутые параметры и он расчитывает сколько ферм можно купить в
год при текущей прибыли.
Метод должен быть устойчив к вводу недопустимых данных, и возвращать число в строковом представлении, либо
сообщение "INPUT PARAMS ARE INCORRECT"
Если за год не хватает прибыли на покупку как минимум 1й новой фермы то кроме результата вывести дополнительное
сообщение "NOT PROFITABLE"
Если за год хватает прибыли на покупку как минимум 1й новой фермы то кроме результата вывести дополнительное
сообщение "PROFITABLE"
Если за год хватает прибыли на покупку более 3х новых ферм то кроме результата вывести дополнительное
сообщение "SUPER PROFITABLE"
Каждый аспект задачи должен быть утвержен как минимум одним тестом.
При решении задачи использовать GIT, TDD подход и MAVEN с библиотекой JUNIT и HAMCREST.
Максимально задействуйте метод assertThat

Комитить только файлы java и pom.xml
*/

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

