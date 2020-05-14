import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Enter byte number: ");
        String input = scanner.next();
        int number = Integer.parseInt(input, 2);
        System.out.print("Position to replace: ");
        int position = scanner.nextInt();
        int result = number | (1 << (position - 1));
        System.out.println("Changed byte number: " + Integer.toBinaryString(result));
        System.out.println("Changed number in decimal format: " + result);
    }
}
