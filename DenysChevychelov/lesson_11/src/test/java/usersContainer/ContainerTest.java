package usersContainer;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ContainerTest {
    Container container = new Container();

    @Test
    public void testContainerHasFieldUser() {
        assertThat(container, Matchers.<Container>hasProperty("user"));
    }

    @Test
    public void testContainerHasFieldNextContainer() {
        assertThat(container, Matchers.<Container>hasProperty("nextContainer"));
    }

}