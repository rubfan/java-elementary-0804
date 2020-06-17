package usersContainer;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest {
    User user = new User();

    @Test
    public void testUserHasFieldName() {
        assertThat(user, Matchers.<User>hasProperty("name"));
    }

    @Test
    public void testUserHasFieldAge() {
        assertThat(user, Matchers.<User>hasProperty("age"));
    }

}