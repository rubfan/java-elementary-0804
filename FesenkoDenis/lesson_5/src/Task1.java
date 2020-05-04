import java.util.Scanner;

public class Task1 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Hечетное");
        }
    }
}
