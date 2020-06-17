import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Task3Test {
    int[] array = {1, 7, 8, 15, 18, 27, 34, 44};

    @Test
    public void testFindSumForResultExist() {
        assertThat(Task3.findSum(array, 35), equalTo(true));
    }
    @Test
    public void testFindSumForNoResultExist() {
        assertThat(Task3.findSum(array, 25), equalTo(false));
    }
    @Test
    public void testFindSumNumberMatchToSingleItem() {
        assertThat(Task3.findSum(array, 15), equalTo(false));
    }
}
