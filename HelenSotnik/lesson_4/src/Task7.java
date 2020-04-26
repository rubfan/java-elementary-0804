import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people in a party: ");
        int nPeople = scanner.nextInt();
        double vBottle = 750;
        double vPerPerson = 100;
        int nOfBottles = (int) Math.ceil(nPeople * vPerPerson / vBottle);
        System.out.println("Necessary number of bottles of champagne:  " + nOfBottles);
        double vLeft = nOfBottles - (nPeople * vPerPerson / vBottle);
        System.out.println("Volume in champagne bottle left: " + (vLeft) + " ml.");
    }
}
