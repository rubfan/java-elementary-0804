public class Farm {
    private double farmPrice;
    private int cowsAmount;
    private double milkLiters;
    private double feedAmount;
    private double feedPrice;
    private double milkPrice;
    private int tax;
    private int salary;

    public double findOutFarmPrice(double farmPrice) {
        this.farmPrice = farmPrice;
        if (farmPrice >= 500 && farmPrice <= 1000) {
            return farmPrice;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public int findOutCowsAmount(int cowsAmount) {
        this.cowsAmount = cowsAmount;
        if (cowsAmount >= 50 && cowsAmount <= 100) {
            return cowsAmount;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public double findOutMilkLiters(double milkLiters) {
        this.milkLiters = milkLiters;
        if (milkLiters >= 1 && milkLiters <= 5) {
            return milkLiters;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public double findOutFeedAmount(double feedAmount) {
        this.feedAmount = feedAmount;
        if (feedAmount >= 5 && feedAmount <= 10) {
            return feedAmount;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public double findOutFeedPrice(double feedPrice) {
        this.feedPrice = feedPrice;
        if (feedPrice >= 1 && feedPrice <= 3) {
            return feedPrice;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public double findOutMilkPrice(double milkPrice) {
        this.milkPrice = milkPrice;
        if (milkPrice >= 5 && milkPrice <= 10) {
            return milkPrice;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public int findOutProfitTax(int tax) {
        this.tax = tax;
        if (tax >= 10 && tax <= 20) {
            return tax;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public int findOutMilkmaidSalary(int salary) {
        this.salary = salary;
        if (salary >= 5 && salary <= 10) {
            return salary;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return 0;
        }
    }
    public static void amountOfFutureFarms(double farmPrice, int cowsAmount, double milkLiters, double feedAmount, double feedPrice, double milkPrice, int tax, int salary) {
        double profit = cowsAmount * milkLiters * milkPrice;
        double feedExpenses = cowsAmount * feedAmount * feedPrice;
        double profitTax = (profit - feedExpenses) / 100 * tax;
        double labourExpenses = (profit - feedExpenses - profitTax) / 100 * salary;
        double realProfitInAYear = (profit - feedExpenses - profitTax - labourExpenses) * 365;
        int futureFarms = (int) (realProfitInAYear / farmPrice);
        System.out.println(futureFarms);
        if (futureFarms < 1) {
            System.out.println("NOT PROFITABLE");
        } else if (futureFarms >= 1 && futureFarms <= 3) {
            System.out.println("PROFITABLE");
        } else {
            System.out.println("SUPER PROFITABLE");
        }
    }
}
