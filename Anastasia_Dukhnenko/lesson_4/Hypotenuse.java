public class Hypotenuse {
    public static void main(String[] params) {
        double a = Double.parseDouble(params[0]);
        double b = Double.parseDouble(params[1]);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Длина гипотенузы = " + c);
    }
}
