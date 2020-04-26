import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer a: ");
        int a = scanner.nextInt();
        System.out.println("Enter integer b: ");
        int b = scanner.nextInt();
        System.out.println("Enter integer c: ");
        int c = scanner.nextInt();
        int max = (a * b > a * c) ? ((a > b) ? a : b) : ((a > c) ? a : c);
        System.out.println("The highest number is " + max);
    }
}