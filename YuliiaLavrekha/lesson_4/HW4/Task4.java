package HW4;

public class Task4 {
    public static void main(String[] args) {
        double lengthA = Double.parseDouble(args[0]);
        double lengthB = Double.parseDouble(args[1]);
        double hypotenuse = Math.sqrt(Math.pow(lengthA, 2) + Math.pow(lengthB, 2));
        System.out.println("Length of the hypotenuse is: " + hypotenuse);
    }
}
