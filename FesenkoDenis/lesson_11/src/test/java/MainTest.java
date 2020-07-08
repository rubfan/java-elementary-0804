import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTest {
    private final Main main = new Main();

    @Before
    public void init() {

    }

    @Test
    public void task2Test() {
        assertThat(main.task2(), equalTo(120));
    }

    @Test
    public void task3FirstCaseTest() {
        int[] arr1 = {1, 2, 3, 4, 8, 10, 12, 13};
        int sum = 3;
        int k = 0;
        assertThat(main.task3FirstCase(arr1, sum, k), equalTo(22));
    }

    @Test
    public void task3SecondCaseTest() {
        int[] arr1 = {1, 2, 3, 4, 8, 10, 12, 13};
        int sum = 3;
        int t = 0;
        assertThat(main.task3SecondCase(arr1, sum, t), equalTo(1));
    }

    @Test
    public void task4SelectionSortTest() {
        int count = 0;
        int position = 0;
        int min = 0;
        int[] arr1 = {111, 23, 2, 2, 1, 1, 0, -1, -2, 10, 111, 23, 2, 2, 1, 1,
                0, -1, -2, 10, 1, 1, 0, -1, -2, 10, 111, 23, 2, 2, 1};
        assertThat(main.task4SelectionSort(count, position, min, arr1), equalTo(465));
    }

    @Test
    public void task4SearchingForMinimalValueTest() {
        int count = 0;
        int position = 0;
        int min = 0;
        int[] arr1 = {111, 23, 2, 2, 1, 1, 0, -1, -2, 10, 111, 23, 2, 2, 1, 1,
                0, -1, -2, 10, 1, 1, 0, -1, -2, 10, 111, 23, 2, 2, 1};
        assertThat(main.task4SearchingForMinimalValue(count, position, min, arr1), equalTo(30));
    }
    @Test
    public void task5FibonacciWithoutRecursionTest() {
        int first = 0;
        int second = 1;
        int current = 1;
        int fibonacci = 7;
        assertThat(main.task5FibonacciWithoutRecursion(fibonacci, first, second, current),
                equalTo("Number of Fibonacci with index 7 = 13"));
    }

    @Test
    public void task5FibonacciWithRecursionTest() {
        int current = 1;
        int f = 7;
        assertThat(main.task5FWithRecursion(f, current),
                equalTo(13));
    }
}
