import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class Task5Test {
    @Test
    public void testFibonacciGetElementIterativeFirst() {
        assertThat(Task5.fibonacciGetElementIterative(1), equalTo(1));
    }

    @Test
    public void testFibonacciGetElementIterative() {
        assertThat(Task5.fibonacciGetElementIterative(15), equalTo(610));
    }

    @Test
    public void testFibonacciGetElementRecursiveFirst() {
        assertThat(Task5.fibonacciGetElementRecursive(1), equalTo(1));
    }

    @Test
    public void testFibonacciGetElementRecursive() {
        assertThat(Task5.fibonacciGetElementRecursive(15), equalTo(610));
    }

}