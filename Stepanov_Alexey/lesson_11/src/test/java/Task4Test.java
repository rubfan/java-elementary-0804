import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class Task4Test {
    int[] array = {60, 43, 70, 42, 76, 75, 85, 86, 69, 61, 87, 52, 5, 40, 36, 53, 50, 75, 56, 60};

    @Test
    public void testFindMinBySort() {
        assertThat(Task4.findMinBySort(array, false), equalTo(5));
    }
}