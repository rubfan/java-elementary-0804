import java.util.Scanner;

public class Task6 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int terrible = 0, poor = 5, good = 10, great = 15, excellent = 20;
        double a = scanner.nextDouble();
        String s = scanner.next();
        if (s.equals("terrible")) {
            System.out.printf("You should pay: %.2f", ((a / 100) * terrible + a));
        } else if (s.equals("poor")) {
            System.out.printf("You should pay: %.2f", ((a / 100) * poor + a));
        } else if (s.equals("good")) {
            System.out.printf("You should pay: %.2f", ((a / 100) * good + a));
        } else if (s.equals("great")) {
            System.out.printf("You should pay: %.2f", ((a / 100) * great + a));
        } else if (s.equals("excellent")) {
            System.out.printf("You should pay: %.2f", ((a / 100) * excellent + a));
        }
    }
}