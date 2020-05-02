import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = random.nextInt(100);
            array[i] = r;
        }
        System.out.println("Array with random numbers: " + Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements to calculate sum");
		int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Sum of first " + n + " elements in array: " + sum);
    }
}
