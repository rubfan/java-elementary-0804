import org.junit.Assert;
import org.junit.Test;

public class SumTest {
    private Sum sum = new Sum();

    @Test
    public void findOutTheAnswerTest() {
        boolean x = sum.findOutTheAnswer(new Integer[] {1, 5, 7, 9, 12}, 12);
        boolean x2 = sum.findOutTheAnswer(new Integer[] {2, 5, 8, 11, 19}, 7);
        boolean x3 = sum.findOutTheAnswer(new Integer[] {1, 5, 7, 9, 12}, 3);
        boolean x4 = sum.findOutTheAnswer(new Integer[] {2, 5, 8, 11, 19}, 34);
        Assert.assertEquals(x, true);
        Assert.assertEquals(x2, true);
        Assert.assertEquals(x3, false);
        Assert.assertEquals(x4, false);
    }
}
