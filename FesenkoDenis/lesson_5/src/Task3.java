import java.util.Scanner;

public class Task3 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println(a + " is closer");
        } else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            System.out.println(b + " is closer");
        } else {
            System.out.println("The distance is the same");
        }
    }
}
