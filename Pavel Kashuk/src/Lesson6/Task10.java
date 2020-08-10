package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
10) Вывести первые 5 минимальных элементов массива
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's length:");
        int size = scanner.nextInt();
        int[] arr = makeRandomArr(size);
        System.out.println("array: " + Arrays.toString(arr));
        System.out.println("The first five smallest elem in array:");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = arr.length - 1; j > i; --j) {
                if (arr[j] < arr[j - 1]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
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
