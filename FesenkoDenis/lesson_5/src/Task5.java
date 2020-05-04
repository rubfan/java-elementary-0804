import java.util.Scanner;

public class Task5 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        String s;
        a = scanner.nextDouble();
        s = scanner.next();
        b = scanner.nextDouble();
        if (s.equals("+")) {
            System.out.println(a + b);
        } else if (s.equals("-")) {
            System.out.println(a - b);
        } else if (s.equals("*")) {
            System.out.println(a * b);
        } else if (s.equals("/")) {
            System.out.println(a / b);
        } else if (s.equals("%")) {
            System.out.println(a % b);
        } else if (s.equals("|")) {
            System.out.println(Math.abs(a));
        }
    }
}