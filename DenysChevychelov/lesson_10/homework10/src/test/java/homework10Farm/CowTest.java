package homework10Farm;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CowTest {
    Farm farm = new Farm();

    @Test
    public void testCalculateYearlyCowRevenue() {
        farm.setCowParams(50, 8f, 3f, 3f, 10f);
        assertThat(farm.cows.calculateYearlyCowRevenue(), is(equalTo((3*10-8*3f)*365)));
    }
}