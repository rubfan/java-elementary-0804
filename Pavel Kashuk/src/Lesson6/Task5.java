package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
5) Найти сумму первых n элементов массива
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter array's length:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The sum of the first n elements in array:");
        int n;
        while (true) {
            System.out.println("Enter n:");
            n = scanner.nextInt();
            if (n > arr.length)
                System.out.println("n more than elements in array \ntry again");
            else
                break;
        }
        System.out.printf("Sum of the first %s elem in array: " + sum(arr, n), n);
    }

    private static int sum(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }
        return result;
    }
}
