package lesson11;
/*
3) Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".
     Пример ввода:
     a = {1, 5, 7, 9, 12}
     sum = 12
     Результат:
     true - так как 5 + 7 = 12
     a = {1, 5, 7, 9, 12}
     sum = 3
     Результат:
     false - так как нет двух чисел, которые в сумме дают 3
 */

public class SumTwoNumbersInArray {
    public  boolean printPairsUsingTwoPointers(int[] arr, int sumValue) {
        int left = 0;
        int right = arr.length - 1;
        boolean result = false;
        while (left < right) {
            int sumTemp = arr[left] + arr[right];
            if (sumTemp == sumValue) {
                System.out.printf("(%d, %d) %n", arr[left], arr[right]);
                result = true;
                left++;
                right--;
            } else if (sumTemp < sumValue) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
