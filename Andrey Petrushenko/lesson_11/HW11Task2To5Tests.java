import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HW11Task2To5Tests {
    //Task 3 Есть массив с числами упорядоченными по возрастанию,
    // нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".
    @Test
    public void testGetSumElementsOrderedArrayTr() {
        int[] arr = {1, 3, 4, 8, 14, 15, 17, 23};
        int sum = 11;
        int firstElem = 0;
        int lastElem = arr.length - 1;
        boolean result = HW11Task3.getFindSumElements(arr, sum, firstElem, lastElem);
        assertThat(result, is(true));

    }

    @Test
    public void testGetSumElementsOrderedArrayFa() {
        int[] arr = {1, 3, 4, 8, 14, 15, 17, 23};
        int sum = 235;
        int firstElem = 0;
        int lastElem = arr.length - 1;
        boolean result = HW11Task3.getFindSumElements(arr, sum, firstElem, lastElem);
        assertThat(result, is(false));

    }
    //Task 4 Сделайте сортировку выборкой,
    // когда нужно найти минимальный элемент и посчитайте сколько на нее отводится операций(времени)
    //попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время

    @Test
    public void testGetSortSelect() {
        int[] arr = {25, 38, 12, 23, 4, 15, 45, 8, 68, 1,};
        HW11Task4.getSortSelect(arr);
        int[] arr2 = {145, 12, 18, 3, 87, 24, 57, 32, 22, 44, 67, 87};
        HW11Task4.getSortSelect(arr2);

    }
    //Task 5 Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
    //Последовательность Фибоначчи - первые 2 элемента равны 1,
    // каждый следующий равен сумме двух предыдущих:
    //1 1 2 3 5 8 13 21 34 55 ...
    //Также определите сложность вашего решения
    //Задачу нужно решить с рекурсией и без ее использования

    @Test
    public void testGetFibonacciSequence() {
        int nElem = 2;
        HW11Task5.getFibonacciSequence(nElem);
        int nElem2 = 14;
        HW11Task5.getFibonacciSequence(nElem2);
    }

    @Test
    public void testGetFibonacciSequenceRecursion() {
        int nElem = 2;
        HW11Task5.getFibonacciSequenceRecursion(nElem);
        assertThat(HW11Task5.getFibonacciSequenceRecursion(nElem), is(1));
        int nElem2 = 12;
        HW11Task5.getFibonacciSequenceRecursion(nElem2);
        assertThat(HW11Task5.getFibonacciSequenceRecursion(nElem2), is(144));
    }

}
