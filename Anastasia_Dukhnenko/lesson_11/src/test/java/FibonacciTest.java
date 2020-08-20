import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void solveWithRecursionTest() {
        int x = fibonacci.solveWithRecursion(4);
        int x2 = fibonacci.solveWithRecursion(1);
        int x3 = fibonacci.solveWithRecursion(6);
        int x4 = fibonacci.solveWithoutRecursion(4);
        int x5 = fibonacci.solveWithoutRecursion(1);
        int x6 = fibonacci.solveWithoutRecursion(6);
        Assert.assertEquals(x, 3);
        Assert.assertEquals(x2, 1);
        Assert.assertEquals(x3, 8);
        Assert.assertEquals(x4, 3);
        Assert.assertEquals(x5, 1);
        Assert.assertEquals(x6, 8);
    }

}
