package lesson11Test;

import lesson11.SumTwoNumbersInArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class SumTwoNumbersInArrayTest {
    SumTwoNumbersInArray sumTwoNumbers;

    @Before
    public void init() {
        sumTwoNumbers = new SumTwoNumbersInArray();
    }

    @Test
    public void checkSumInArrIfSetPosNumbersShouldReturnTrue() {
        int[] arr = {1, 3, 5, 7, 9, 12, 15};
        int sum = 10;
        Assert.assertThat(sumTwoNumbers.printPairsUsingTwoPointers(arr, sum), equalTo(true));
    }

    @Test
    public void checkSumInArrIfSetPosNumbersShouldReturnFalse() {
        int[] arr = {1, 3, 5, 7, 9, 12, 15};
        int sum = 9;
        Assert.assertThat(sumTwoNumbers.printPairsUsingTwoPointers(arr, sum), equalTo(false));
    }

    @Test
    public void checkSumInArrIfSetNegNumbersShouldReturnTrue() {
        int[] arr = {-15, -12, -9, -7, -5, -3, -1};
        int sum = -10;
        Assert.assertThat(sumTwoNumbers.printPairsUsingTwoPointers(arr, sum), is(true));
    }

    @Test
    public void checkSumInArrIfSetNegNumbersShouldReturnFalse() {
        int[] arr = {-15, -12, -9, -7, -5, -3, -1};
        int sum = -9;
        Assert.assertThat(sumTwoNumbers.printPairsUsingTwoPointers(arr, sum), is(false));
    }
}
