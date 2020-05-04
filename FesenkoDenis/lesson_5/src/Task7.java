import java.util.Scanner;

public class Task7 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int days, cost = 40;
        days = scanner.nextInt();
        if (days < 5) {
            System.out.println(cost * days);
        } else if (days < 7) {
            System.out.println(cost * days - 20);
        } else {
            System.out.println(cost * days - 50);
        }
    }
}