package Task1Test;

import Task1.User;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class UserTest {
    private final User user = new User();

    @Test
    public void testFieldName() {
        assertThat(user, Matchers.<User>hasProperty("name"));
    }

    @Test
    public void testFieldAge() {
        assertThat(user, Matchers.<User>hasProperty("age"));
    }

}
