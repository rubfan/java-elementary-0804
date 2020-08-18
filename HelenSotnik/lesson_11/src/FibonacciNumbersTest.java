package homework;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

public class FibonacciNumbersTest {
    private FibonacciNumbers fib = new FibonacciNumbers();

    @Test
    public void fibonacci_test() {
        assertThat(fib.fibonacci(6), equalTo(8));
        assertThat(fib.fibonacci(3), is(2));
        assertThat(fib.fibonacci(5), equalTo(5));
        assertThat(fib.fibonacci(10), is(55));
        assertThat(fib.fibonacci(9), equalTo(34));
    }

    @Test
    public void fibonacciRecursion_test() {
        assertEquals(5, fib.fibonacciR(5));
        assertThat(fib.fibonacci(12), equalTo(144));
        assertEquals(233, fib.fibonacciR(13));
        assertEquals(13, fib.fibonacciR(7));
        assertThat(fib.fibonacciR(8), equalTo(21));
    }

    @Test
    public void complexityOfSolution_test() {
        assertThat(fib.complexityOfSolution(), containsString("Complexity of method fibonacci is O(n) while\n" +
                "Complexity of method fibonacciR(recursive) is 2^O(n), which is much longer\n"));
    }
}
