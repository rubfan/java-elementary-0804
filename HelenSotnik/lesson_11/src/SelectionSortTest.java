package homework;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

public class SelectionSortTest {
    private SelectionSort ss = new SelectionSort();

    @Test
    public void selectionSort_minElementSearch_test() {
        int[] testArray = {11, 4, -55, -6, 9};

        assertEquals("Sorted array: [-55, -6, 4, 9, 11]\n" +
                "Min element: -55\n" +
                "Number of iterations: 8\n", ss.selectionSort(testArray));
    }

    @Test
    public void selectionSort_minElementSearch_test2() {
        int[] testArray = {7, 1, 88, -100, 9, 0};

        assertThat(ss.selectionSort(testArray), equalTo("Sorted array: [-100, 0, 1, 7, 9, 88]\n" +
                "Min element: -100\n" +
                "Number of iterations: 15\n"));
    }

    @Test
    public void isNumbersOfIterationsIncreasesWithIncreasingArrayElements_test() {
        int[] testArray = {1, 9, 0, 66};
        int[] increasedTestArray = {1, 9, 0, 66, 8, -66, 7, 3, 2};

        assertEquals("Sorted array: [0, 1, 9, 66]\n" +
                "Min element: 0\n" +
                "Number of iterations: 6\n", ss.selectionSort(testArray));

        assertEquals("Sorted array: [-66, 0, 1, 2, 3, 7, 8, 9, 66]\n" +
                "Min element: -66\n" +
                "Number of iterations: 32\n", ss.selectionSort(increasedTestArray));
    }
}
