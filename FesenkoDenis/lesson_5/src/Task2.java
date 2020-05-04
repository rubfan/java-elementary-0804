import java.util.Scanner;

public class Task2 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (b != 0 && a % b == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
