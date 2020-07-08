package lesson10;
/*
Ферма стоит от $500 до $1000
На ферме находится от 50 до 100 коров
Каждая корова приностит от 1 до 5 литров молока в день
Каждая корова потребляет от 5 до 10 килограм корма в день
Килограм корма стоит от $1 до 3$
Продажа 1 литра молока приностит от $5 до 10$
Фермер платит налог от прибыли от 10% до 20%
Фермер платит зарплату дояркам от 5% до 10% от прибыли после уплаты налогов
Написать код которому на вход передаются все упомянутые параметры и он расчитывает сколько ферм можно купить в год при текущей прибыли.
Метод должен быть устойчив к вводу недопустимых данных, и возвращать число в строковом представлении, либо сообщение "INPUT PARAMS ARE INCORRECT"
Если за год не хватает прибыли на покупку как минимум 1й новой фермы то кроме результата вывести дополнительное сообщение "NOT PROFITABLE"
Если за год хватает прибыли на покупку как минимум 1й новой фермы то кроме результата вывести дополнительное сообщение "PROFITABLE"
Если за год хватает прибыли на покупку более 3х новых ферм то кроме результата вывести дополнительное сообщение "SUPER PROFITABLE"
Каждый аспект задачи должен быть утвержен как минимум одним тестом.
При решении задачи использовать GIT, TDD подход и MAVEN с библиотекой JUNIT и HAMCREST.
Максимально задействуйте метод assertThat
 */

public class FarmService {

    CowFarm cowFarm = new CowFarm();
    Cow cow = new Cow();
    Farmer farmer = new Farmer();

    public CowFarm getCowFarm() {
        return cowFarm;
    }

    public Cow getCow() {
        return cow;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    private boolean checkInputLimits(int minValue, int maxValue, double parameter) {
        return parameter >= minValue && parameter <= maxValue;
    }

    public String setValueForFarmPrice(double farmPrice) {
        if (checkInputLimits(500, 1000, farmPrice)) {
            cowFarm.setFarmPrice(farmPrice);
            System.out.println("Farm price is: " + cowFarm.getFarmPrice());
            return Double.toString(farmPrice);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForAmountOfCow(int amountOfCow) {
        if (checkInputLimits(50, 100, amountOfCow)) {
            cowFarm.setAmountOfCow(amountOfCow);
            System.out.println("Cows on farm is: " + cowFarm.getAmountOfCow());
            return Integer.toString(amountOfCow);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForProduceMilk(double produceMilkPerDay) {
        if (checkInputLimits(1, 5, produceMilkPerDay)) {
            cow.setProduceMilkPerDay(produceMilkPerDay);
            System.out.println("Amount of produce milks is: " + cow.getProduceMilkPerDay());
            return Double.toString(produceMilkPerDay);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForConsumeFeed(double consumeFeedPerDay) {
        if (checkInputLimits(5, 10, consumeFeedPerDay)) {
            cow.setConsumeFeedPerDay(consumeFeedPerDay);
            System.out.println("Amount of consume feed is: " + cow.getConsumeFeedPerDay());
            return Double.toString(consumeFeedPerDay);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForPriceFeedToPurchase(double priceFeedForPurchase) {
        if (checkInputLimits(1, 3, priceFeedForPurchase)) {
            farmer.setPriceFeedForPurchase(priceFeedForPurchase);
            System.out.println("Amount of feed price is: " + farmer.getPriceFeedForPurchase());
            return Double.toString(priceFeedForPurchase);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForPriceMilkToSell(double priceMilkForSell) {
        if (checkInputLimits(5, 10, priceMilkForSell)) {
            farmer.setPriceMilkForSell(priceMilkForSell);
            System.out.println("Amount of milk price is: " + farmer.getPriceMilkForSell());
            return Double.toString(priceMilkForSell);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForPayTax(double payTax) {
        if (checkInputLimits(10, 20, payTax)) {
            farmer.setPayTax(payTax);
            System.out.println("Tax of profit is: " + farmer.getPayTax() + " %");
            return Double.toString(payTax);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public String setValueForPaySalaryToStaff(double paySalaryToStaff) {
        if (checkInputLimits(5, 10, paySalaryToStaff)) {
            farmer.setPaySalaryToStaff(paySalaryToStaff);
            System.out.println("Amount of salary to personal is: " + farmer.getPaySalaryToStaff() + " %");
            return Double.toString(paySalaryToStaff);
        } else {
            String res = "INPUT PARAMS ARE INCORRECT";
            System.out.println(res);
            return res;
        }
    }

    public double calculateFarmProfit() {
        double profitWithOutExpenses = (cowFarm.getAmountOfCow() * cow.getProduceMilkPerDay()
                * farmer.getPriceMilkForSell() * 365);
        System.out.println("Profit without any expenses is: " + profitWithOutExpenses);

        double expenses = (cowFarm.getAmountOfCow() * cow.getConsumeFeedPerDay()
                * farmer.getPriceFeedForPurchase() * 365);
        System.out.println("Expenses of keeping cows is: " + expenses);

        if (profitWithOutExpenses > 0 && expenses > 0) {
            double profit = profitWithOutExpenses - expenses;
            System.out.println("Profit after calculating expenses of cows is: " + profit);
            return profit;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }

    public double calculateFarmProfitAfterTax(double profit) {
        if (profit > 0) {
            profit -= profit * farmer.getPayTax() / 100;
            System.out.println("Amount of profit after tax is: " + profit);
            return profit;
        } else {
            System.out.println("No profit");
            return 0;
        }
    }

    public double calculateFarmProfitAfterSalary(double profit) {
        if (profit > 0) {
            profit -= profit * farmer.getPaySalaryToStaff() / 100;
            System.out.println("Amount of profit after salary is: " + profit);
            return profit;
        } else {
            System.out.println("No profit");
            return 0;
        }
    }

    public String calculateClearFarmProfit() {
        double profitWithOutTaxAndSalary = calculateFarmProfit();
        double profitAfterTax = calculateFarmProfitAfterTax((profitWithOutTaxAndSalary));
        double profitAfterSalary = calculateFarmProfitAfterSalary((profitAfterTax));
        String clearProfit = calculateAbleToBuyNewFarm((profitAfterSalary));
        return clearProfit;
    }

    public String calculateAbleToBuyNewFarm(double profit) {
        String productionGrade;
        int farmsAmount = (int) (profit / cowFarm.getFarmPrice());

        if (farmsAmount > 3) {
            System.out.println("Current profit is: " + profit);
            System.out.println("You can purchase " + farmsAmount + " farm(s)");
            productionGrade = "SUPER PROFITABLE";
        } else if (farmsAmount >= 1) {
            System.out.println("Current profit is: " + profit);
            System.out.println("You can purchase " + farmsAmount + " farm(s)");
            productionGrade = "PROFITABLE";
        } else {
            System.out.println("Current profit is: " + profit);
            System.out.println("Can't purchases any farms yet");
            productionGrade = "NOT PROFITABLE";
        }
        System.out.println(productionGrade);
        return productionGrade;
    }
}
