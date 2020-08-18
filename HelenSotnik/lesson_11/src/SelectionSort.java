package homework;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {19, 0, 8, -1, 3, -13};
        System.out.println(selectionSort(array));

        int[] array2 = {19, 0, 8, -1, 3, -13, 1, -51, 19};
        System.out.println(selectionSort(array2));

    }

    protected static String selectionSort(int[] sortedArr) {
        int n = sortedArr.length;
        int iterations = (n - 1) * (n / 2);
        for (int min = 0; min < n; min++) {
            int least = min;
            for (int j = min + 1; j < n; j++) {
                if (sortedArr[j] < sortedArr[least]) {
                    least = j;
                }
            }
            int tmp = sortedArr[min];
            sortedArr[min] = sortedArr[least];
            sortedArr[least] = tmp;
        }
        return "Sorted array: " + Arrays.toString(sortedArr) + "\n" +
                "Min element: " + sortedArr[0] + "\n" +
                "Number of iterations: " + iterations + "\n";
    }
}
