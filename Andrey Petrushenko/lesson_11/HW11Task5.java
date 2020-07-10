public class HW11Task5 {
    //Task 5 Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
    //Последовательность Фибоначчи - первые 2 элемента равны 1,
    // каждый следующий равен сумме двух предыдущих:
    //1 1 2 3 5 8 13 21 34 55 ...
    //Также определите сложность вашего решения
    //Задачу нужно решить с рекурсией и без ее использования
    private static int elem1 = 0;
    private static int elem2 = 1;

    public static void getFibonacciSequence(int nElem) {
        int[] arrFib = new int[nElem];
        arrFib[0] = 1;
        arrFib[1] = 1;
        for (int i = 2; i < nElem; i++) {
            arrFib[i] = arrFib[i - 1] + arrFib[i - 2];
        }
        if (nElem <= 2) {
            nElem = 1;
        }
        System.out.println("N member Fibonacci sequence = " + arrFib[nElem - 1] + ", complexity O(n)");
    }

    public static int getFibonacciSequenceRecursion(int nElem) {
        int numF = 0;
        if (nElem <= 2) {
            return 1;
        }
        if (nElem > 2) {
            numF = elem1 + elem2;
            elem1 = elem2;
            elem2 = numF;
            getFibonacciSequenceRecursion(nElem - 1);
        }
        return numF;
    }
}
