import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer ");
        int a = scanner.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println("Enter number of bit to change");
        int bitNum = scanner.nextInt();
        bitNum--;
        int n2 = 0;
        n2 = 1 << bitNum;
        a = a | n2;
        System.out.println("Result of change in binary: " + Integer.toBinaryString(a));
        System.out.println("Decimal result: " + a);
    }
}
