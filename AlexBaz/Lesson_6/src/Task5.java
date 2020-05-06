import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[20];
        for (int i = 0; i < 20 ; i++) {
            arr [i] = i + 1;
        }
        System.out.println("Задайте число первых элементов массива от 1 до 20");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма первых " + n + " элементов массива = " + sum);

    }
}
