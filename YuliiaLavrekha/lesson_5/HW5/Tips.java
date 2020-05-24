package HW5;

public class Tips {

    public static void main(String[] args) {
        double totalSum = Double.parseDouble(args[0]);
        if (args[1].equals("terrible")) {
            System.out.println("Tips are not necessary.");
        } else if (args[1].equals("poor")) {
            System.out.println("Tips: " + round(totalSum * 0.05));
        } else if (args[1].equals("good")) {
            System.out.println("Tips: " + round(totalSum * 0.1));
        } else if (args[1].equals("great")) {
            System.out.println("Tips: " + round(totalSum * 0.15));
        } else if (args[1].equals("excellent")) {
            System.out.println("Tips: " + round(totalSum * 0.2));
        } else {
            System.out.println("Please, try again.");
        }
    }

    public static double round(double tips) {
        return Math.round(tips * 100.0) / 100.0;
    }
}
