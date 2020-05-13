package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
6) Найти минимальный и максимальный элемент массива
 */

public class Task6 {
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
        int max = arr[0];
        int min = arr[0];
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        System.out.println("Max value in array is: " + max +
                "\nMin value in array is: " + min);
    }
}
