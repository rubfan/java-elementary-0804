package FarmHW;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Farm newFarm = new Farm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input cost of the farm: ");
        newFarm.setFarmCost(scanner.nextInt());

        System.out.println("Input number of cows: ");
        newFarm.setCowsNumber(scanner.nextInt());

        System.out.println("Input number of milk that cow gives: ");
        newFarm.setMilkThatCowGives(scanner.nextInt());

        System.out.println("How many kg cow eat: ");
        newFarm.setNumberOfCowFood(scanner.nextInt());

        System.out.println("Price of food: ");
        newFarm.setFoodCost(scanner.nextInt());

        System.out.println("Price of milk: ");
        newFarm.setMilkCost(scanner.nextInt());

        newFarm.profit();

        System.out.println("Input % tax: ");
        newFarm.getTax(scanner.nextDouble());

        System.out.println("Input % salary: ");
        newFarm.getSalaryPersonal(scanner.nextDouble());

        newFarm.getFarmYouCanBuy(newFarm.yearProfit);
        System.out.println(newFarm.profit());
    }
}
