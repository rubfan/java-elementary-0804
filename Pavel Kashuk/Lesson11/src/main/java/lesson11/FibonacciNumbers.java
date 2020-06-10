package lesson11;
/*
5) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
Последовательность Фибоначчи - первые 2 элемента равны 1, каждый следующий равен сумме двух предыдущих:
1 1 2 3 5 8 13 21 34 55 ...
Также определите сложность вашего решения
Задачу нужно решить с рекурсией и без ее использования
 */

public class FibonacciNumbers {
    // Algorithm complexity - O(2^n);
    public long getFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
    }

    // Algorithm complexity - O(n);
    public long getFibonacciWithoutRecursive(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
