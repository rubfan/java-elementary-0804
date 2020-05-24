package lesson8;

import java.util.Arrays;
/*
5) Есть 2 полученых с помошью метода из 4го задания массива упорядоченных по возрастанию.
Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.
     Пример ввода:
     a = {1, 3, 5}
     b = {2, 4, 8, 9, 12}
     Результат:
     c = {1, 2, 3, 4, 5, 8, 9, 12}
 */

public class MergeArray {
    public static void main(String[] args) {
        int[] firstArr = SortArray.bubbleSort(SortArray.createRandomArr());
        System.out.println("==================================");
        int[] secondArr = SortArray.selectionSort(SortArray.createRandomArr());
        System.out.println("==================================");
        mergerArr(firstArr,secondArr);
    }

    public static void mergerArr(int[] a, int[] b) {
        int[] resultArr = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < resultArr.length; i++) {
            if (indexA < a.length && indexB < b.length) {
                if (a[indexA] < b[indexB]) {
                    resultArr[i] = a[indexA];
                    indexA++;
                } else {
                    resultArr[i] = b[indexB];
                    indexB++;
                }
            } else {
                if (indexA < a.length) {
                    resultArr[i] = a[indexA];
                    indexA++;
                }
                if (indexB < b.length) {
                    resultArr[i] = b[indexB];
                    indexB++;
                }
            }
        }
        System.out.println("Merged array is:\n" +
                Arrays.toString(resultArr));
    }
}
