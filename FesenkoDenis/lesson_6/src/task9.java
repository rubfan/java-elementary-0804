import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int aB = 0b00000000;
        aB += 1;
        aB <<= a;
        System.out.println(Integer.toBinaryString(aB));
        System.out.println(aB);
    }
}
