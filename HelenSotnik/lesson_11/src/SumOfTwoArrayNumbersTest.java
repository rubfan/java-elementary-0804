package homework;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

public class SumOfTwoArrayNumbersTest {
    private SumOfTwoArrayNumbers sm = new SumOfTwoArrayNumbers();
    private int[] a = {1, 5, 7, 9, 12};
    private int sum = 0;

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_trueTest() {
        sum = 16;
        assertThat(sm.sumSearch(a, sum), is("true as 7+9=16"));
    }

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_trueTest2() {
        sum = 10;
        assertEquals(sm.sumSearch(a, sum), "true as 1+9=10");
    }

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_trueTest3() {
        sum = 8;
        assertThat(sm.sumSearch(a, sum), equalTo("true as 1+7=8"));
    }

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_falseTest() {
        sum = 162;
        assertEquals("false as there are no two numbers in array that give 162 in sum", sm.sumSearch(a, sum));
    }

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_falseTest2() {
        sum = 0;
        assertThat(sm.sumSearch(a, sum), is("false as there are no two numbers in array that give 0 in sum"));
    }

    @Test
    public void doTwoArrayNumbersGiveSumThatIsEqualToGiven_falseTest3() {
        sum = 4;
        assertEquals("false as there are no two numbers in array that give 4 in sum", sm.sumSearch(a, sum));
    }
}

