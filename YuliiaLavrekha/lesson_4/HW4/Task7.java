package HW4;

public class Task7 {
    public static void main(String[] args) {
        double numberOfPeople = Double.parseDouble(args[0]);
        double bottlesOfChampagne = Math.ceil(numberOfPeople * 100 / 750);
        double left = bottlesOfChampagne * 750 - numberOfPeople * 100;
        System.out.println("We need " + (int) bottlesOfChampagne + " bottle(s) of champagne.");
        System.out.println((int) left + " ml of champagne will be left.");
    }
}
