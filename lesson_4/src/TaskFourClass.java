public class TaskFourClass {
    public static void main(String[] args) {
        double legOne = Double.parseDouble(args[0]);
        double legTwo = Double.parseDouble(args[1]);
        System.out.println("Length of hypotenuse equals " + Math.sqrt(legOne * legOne + legTwo * legTwo));
    }
}
