import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer a: ");
        int a = scanner.nextInt();
        System.out.println("Enter integer b: ");
        int b = scanner.nextInt();
        System.out.println("Sum of a and b: " + (a + b));
    }
}