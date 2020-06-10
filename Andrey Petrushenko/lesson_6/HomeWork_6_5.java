import java.util.Scanner;

public class HomeWork_6_5 {
    public static void main(String[] args) {
        int[] arr = {18, 22, 34, 28, 11, 31, 12, 3, 15, 11};
        int sum = 0;
        System.out.println("Введите число  до 10");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма первых " + n + " элементов = " + sum);
    }
}
