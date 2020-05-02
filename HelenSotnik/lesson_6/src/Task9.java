import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer ");
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Enter number of bit to change");
        int bitNumber = scanner.nextInt();
        bitNumber--;
        int n2 = 0;
        n2 = 1 << bitNumber;
        n = n ^ n2;
        System.out.println("Result of change in binary: " + Integer.toBinaryString(n));
        System.out.println("Decimal result: " + n);
    }
}
