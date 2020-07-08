package lesson11;

import java.util.Arrays;
/*
4) Сделайте сортировку выборкой, когда нужно найти минимальный элемент и посчитайте сколько на нее отводится операций(времени)
   попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время
 */

public class SelectionSort {
    public  static Integer[] getMinElementWithSelectionSort(Integer[] arr) {
        int operation = 0;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    operation++;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(operation);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
