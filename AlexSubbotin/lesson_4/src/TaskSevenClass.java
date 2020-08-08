public class TaskSevenClass {
    public static void main(String[] args) {
        int nPeople = Integer.parseInt(args[0]);
        double vBottle = 750;
        double vPerPerson = 100;
        int nOfBottles = (int) Math.ceil(nPeople * vPerPerson / vBottle);
        double vLeft = vBottle * (nOfBottles - (nPeople * vPerPerson / vBottle));
        System.out.println("Necessary number of bottles of champagne:  " + nOfBottles);
        System.out.println("Volume in champagne bottle left: " + vLeft + " ml.");
    }
}
