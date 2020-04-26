import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter numeral system by number: ");
        int c = scanner.nextInt();
        int y = (int) Math.pow(a, b);
        String x = (c == 2) ? Integer.toBinaryString(y) : ((c == 8) ? Integer.toOctalString(y) : ((c == 10) ? Integer.toString(y) : Integer.toHexString(y)));
        System.out.println("First number to the power of second number in chosen numeral system : " + x);
    }
}