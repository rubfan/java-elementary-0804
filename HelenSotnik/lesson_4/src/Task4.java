public class Task4 {
    public static void main(String[] args) {
        double leg1 = Double.parseDouble(args[0]);
        double leg2 = Double.parseDouble(args[1]);
        System.out.println("Length of hypotenuse equals " + Math.sqrt(leg1 * leg1 + leg2 * leg2));
    }
}
