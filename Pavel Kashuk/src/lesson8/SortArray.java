package lesson8;

import java.util.Arrays;
import java.util.Scanner;
/*
4) Сделайте сортировку масива по возрастанию самостоятельно без использования готовых методов библиотек
(можете взять алгоритм пузырьком), и посчитайте сколько на нее отводится циклов с повторяющимся кодом.
Масив можно заполнять случайными double элементами с использованием (Math.random() * N) выражения.
Попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится число повторяющихся операций в цикле.
 */

public class SortArray {
    public static void main(String[] args) {
        bubbleSort(createRandomArr());
        System.out.println("==================================");
        selectionSort(createRandomArr());
    }

    public static int[] createRandomArr() {
        System.out.println("Enter the size of the arr: ");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Unsorted arr is:\n" +
                Arrays.toString(arr));
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int operation = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    operation++;
                }
            }
        }
        System.out.println("Operation is: " + operation);
        System.out.println("Sorted arr is:\n" +
                Arrays.toString(arr));
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int operation = 0;
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
                operation++;
            }
        }
        System.out.println("Operation is " + operation);
        System.out.println("Sorted arr is:\n" +
                Arrays.toString(arr));
        return arr;
    }
}
