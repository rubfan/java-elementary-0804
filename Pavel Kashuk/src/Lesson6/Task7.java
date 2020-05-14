package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
7) Найти сумму всех четных и сумму всех нечетных элементов массива
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's length:");
        int size = scanner.nextInt();
        int[] arr = makeRandomArr(size);
        int evenSum = 0, oddSum = 0;
        int amountEven = 0, amountOdd = 0;
        for (int value : arr) {
            if (value % 2 == 0 && value != 0) {
                evenSum += value;
                amountEven++;
            } else {
                oddSum += value;
                amountOdd++;
            }
        }
        System.out.println("array: " + Arrays.toString(arr));
        System.out.printf("Amount of even numbers in arr is: %s\n",amountEven);
        System.out.format("Sum of even numbers is: %d\n", evenSum);
        System.out.printf("Amount of odd numbers in arr is: %s\n",amountOdd);
        System.out.format("Sum of odd numbers is: %d\n", oddSum);
    }

    private static int[] makeRandomArr(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
