import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = rnd.nextInt(100);
            arr[i] = r;
        }
        System.out.println("Array with random numbers: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements to calculate sum");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of first " + n + " elements in array: " + sum);
    }
}
