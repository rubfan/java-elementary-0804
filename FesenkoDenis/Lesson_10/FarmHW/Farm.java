package FarmHW;

import java.util.Scanner;

public class Farm extends WorkWithMessages {
    private final Scanner scanner = new Scanner(System.in);

    private int farmCost;
    private int cowsNumber;
    private int milk;
    private int cowEatFood;
    private int foodCost;
    private int milkCost;
    private double tax;
    private double salaryPersonal;
    private double profit;
    double yearProfit = profit * 365;

    public String setFarmCost(int farmCost) {
        this.farmCost = farmCost;
        if (farmCost > 1000 || farmCost < 500) {
            return showMassageWithError();
        } else {
            return makeMassageTypeToString(farmCost);
        }
    }

    public String setCowsNumber(int cowsNumber) {
        this.cowsNumber = cowsNumber;
        if (cowsNumber > 100 || cowsNumber < 50) {
            return showMassageWithError();
        }
        return makeMassageTypeToString(cowsNumber);
    }

    public String setMilkThatCowGives(int milk) {
        this.milk = milk;
        if (milk > 5 || milk < 1) {
            return showMassageWithError();
        }
        return makeMassageTypeToString(milk);
    }

    public String setNumberOfCowFood(int cowFood) {
        this.cowEatFood = cowFood;
        if (cowFood > 10 || cowFood < 5) {
            return showMassageWithError();
        }
        return makeMassageTypeToString(cowFood);
    }

    public String setFoodCost(int foodCost) {
        this.foodCost = foodCost;
        if (foodCost > 3 || foodCost < 1) {
            return showMassageWithError();
        }
        return makeMassageTypeToString(foodCost);
    }

    public String setMilkCost(int milkCost) {
        this.milkCost = milkCost;
        if (milkCost > 10 || milkCost < 5) {
            return showMassageWithError();
        }
        return makeMassageTypeToString(milkCost);
    }

    public double profit() {
        profit = cowsNumber * ((milk * milkCost) - (cowEatFood * foodCost));
        return profit;
    }

    public String getTax(double tax) {
        this.tax = tax;
        if (tax > 20 || tax < 10) {
            return showMassageWithError();
        } else {
            tax = profit() - (profit() / tax);
            profit = profit - tax;
        }

        return makeMassageTypeToString(tax);
    }

    public String getSalaryPersonal(double salaryPersonal) {
        this.salaryPersonal = salaryPersonal;
        if (salaryPersonal > 10 || salaryPersonal < 5) {
            return showMassageWithError();
        } else {
            salaryPersonal = profit / salaryPersonal;
            return makeMassageTypeToString(salaryPersonal);
        }
    }

    public String getFarmYouCanBuy(double yearProfit) {
        int farmsYouCanBuy = (int) (yearProfit / farmCost);
        if (farmsYouCanBuy < 0) {
            System.out.println("You have not any profit");
            return "You need to take a credit to pay a bill";
        } else if (farmsYouCanBuy == 0) {
            System.out.println("You can`t buy new farm");
            return "NOT PROFITABLE";
        } else if (farmsYouCanBuy < 3) {
            System.out.println(" You can buy " + farmsYouCanBuy + " new farms");
            return "PROFITABLE";
        } else {
            System.out.println("You can buy " + farmsYouCanBuy + " new farms");
            return "SUPER PROFITABLE";
        }
    }

}
