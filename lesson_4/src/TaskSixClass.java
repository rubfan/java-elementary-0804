public class TaskSixClass {
    public static void main(String[] args) {
        double aDouble = Double.parseDouble(args[0]);
        double bDouble = Double.parseDouble(args[1]);
        double cDouble = Math.PI * bDouble * bDouble * aDouble;
        System.out.println("The volume of cylinder equals " + cDouble);
    }
}
