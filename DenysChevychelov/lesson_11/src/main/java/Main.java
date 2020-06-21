public class Main {
/*
2) Определите сложность следующего алгоритма:
public class Algorithm {
public static void main(String[] args) {
int k = 0;
int n = 10;
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
for (int z = j + 1; z < n; z++) {
k++;
}
}
}
System.out.println("The result is " + k);
}
}

Временная сложность - O(n^3)
*/
    /*
    3) Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли
    в этом массиве 2 числа, сумма которых равна "sum".
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

    public boolean printPairSums(Integer[] arraySorted, int sumValue) {
        int firstIndexNumber = 0;
        int lastIndexNumber = arraySorted.length - 1;
        boolean result = false;
        while (firstIndexNumber < lastIndexNumber) {
            int pairSum = arraySorted[firstIndexNumber] + arraySorted[lastIndexNumber];
            if (pairSum == sumValue) {
                result = true;
                firstIndexNumber++;
                lastIndexNumber--;
            } else {
                if (pairSum < sumValue) firstIndexNumber++;
                else lastIndexNumber--;
            }
        }
        return result;
    }

    /*
    4) Сделайте сортировку выборкой, когда нужно найти минимальный элемент и посчитайте
    сколько на нее отводится операций(времени) попробуйте увеличить количество элементов
    в массиве и оценить на сколько увеличится время
     */

    public Integer[] selectionSort(Integer[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                    counter++;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[minIndex] = temp;
        }
        System.out.println(counter);
        return array;
    }

    /*
    5) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
    Последовательность Фибоначчи - первые 2 элемента равны 1, каждый следующий равен сумме двух предыдущих:
    1 1 2 3 5 8 13 21 34 55 ...
    Также определите сложность вашего решения
    Задачу нужно решить с рекурсией и без ее использования
    */

    public int printFibonacciSequenceMemberByRecursion(int memberNumber) {
        if (memberNumber == 0) {
            return 0;
        }
        if (memberNumber == 1) {
            return 1;
        } else {
            return printFibonacciSequenceMemberByRecursion(memberNumber - 1)
                    + printFibonacciSequenceMemberByRecursion(memberNumber - 2);
        }
    }

    public int printFibonacciSequenceMemberWithOutRecursion(int memberNumber) {
        int firstIndex = 0;
        int secondIndex = 1;
        for (int i = 2; i <= memberNumber; ++i) {
            int nextNumber = firstIndex + secondIndex;
            firstIndex = secondIndex;
            secondIndex = nextNumber;
        }
        return secondIndex;
    }
}


