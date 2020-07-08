package Task1Test;

import Task1.Container;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class ContainerTest {
    private Container container = new Container();

    @Test
    public void testFieldNextCont() {
        assertThat(container, Matchers.<Container>hasProperty("nextContainer"));
    }

    @Test
    public void testFieldUser() {
        assertThat(container, Matchers.<Container>hasProperty("user"));
    }

}
