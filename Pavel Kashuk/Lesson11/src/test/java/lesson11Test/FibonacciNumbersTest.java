package lesson11Test;

import lesson11.FibonacciNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FibonacciNumbersTest {
    FibonacciNumbers fibonacciNumbers;

    @Before
    public void init() {
        fibonacciNumbers = new FibonacciNumbers();
    }

    @Test
    public void getCheckFibonacciNumbersWithRecursion() {
        Assert.assertThat(fibonacciNumbers.getFibonacciRecursive(5), equalTo((long) 5));
    }

    @Test
    public void getCheckFibonacciNumbersWithoutRecursion() {
        Assert.assertThat(fibonacciNumbers.getFibonacciWithoutRecursive(10), is((long) 55));
    }
}
