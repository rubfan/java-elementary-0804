public class Paragraph4 {
    public static void main(String[] args) {
        Float a = Float.parseFloat(args[0]);
        Float b = Float.parseFloat(args[1]);
        Float c = Float.parseFloat(args[2]);
        if (a <= b && a <= c) {
            System.out.println("Число " + a + " самое меньшее из трех");
        }
        if (b <= a && b <= c) {
            System.out.println("Число " + b + " самое меньшее из трех");
        }
        if (c <= b && c <= a) {
            System.out.println("Число " + c + " самое меньшее из трех");
        }
    }
}
