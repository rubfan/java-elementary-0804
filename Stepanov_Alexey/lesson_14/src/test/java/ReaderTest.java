import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ReaderTest {
    private String testText = "1. Bla bla\n" +
            "    answer\n" +
            "2. Bla bla\n" +
            "    answer\n" +
            "3. Bla bla\n" +
            "    answer\n";

    @Test
    public void testNumberOfElements() {
        assertThat(Reader.numberOfElements(testText), equalTo(3));
    }
}
