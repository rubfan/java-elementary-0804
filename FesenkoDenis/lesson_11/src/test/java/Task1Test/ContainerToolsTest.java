package Task1Test;

import Task1.ContainerTools;
import Task1.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ContainerToolsTest {

    private final ContainerTools tools = new ContainerTools();
    private final User first = new User("first", 1);
    private final User second = new User("second", 2);
    private final User third = new User("third", 3);
    private final User fourth = new User("fourth", 4);
    private final User fifth = new User("fifth", 5);

    @Before
    public void init() {
        tools.addItem(first);
        tools.addItem(second);
        tools.addItem(third);
    }

    @Test
    public void testAddItem() {
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='first', age=1}"));
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='second', age=2}"));
        assertThat(tools.getUserByIndex(3).toString(), equalTo("User{name='third', age=3}"));

    }

    @Test
    public void testInsertUserByIndex() {
        tools.insertUserByIndex(fourth, 4);
        assertThat(tools.getUserByIndex(4).toString(), equalTo("User{name='fourth', age=4}"));
    }

    @Test
    public void testUpdateUserByIndex() {
        tools.updateUserByIndex(fifth, 2);
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='fifth', age=5}"));
    }

    @Test
    public void testGetUsersOrderedByAge() {
        tools.updateUserByIndex(fifth, 2);
        tools.getUsersOrderedByAge();
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='first', age=1}"));
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='third', age=3}"));
        assertThat(tools.getUserByIndex(3).toString(), equalTo("User{name='fifth', age=5}"));
    }

    @Test
    public void testGetUsersOrderedByName() {
        tools.insertUserByIndex(new User("aaa", 10), 4);
        tools.getUsersOrderedByName();
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='aaa', age=10}"));
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='first', age=1}"));
        assertThat(tools.getUserByIndex(3).toString(), equalTo("User{name='second', age=2}"));
        assertThat(tools.getUserByIndex(4).toString(), equalTo("User{name='third', age=3}"));
    }

    @Test
    public void testRemoveLastItem() {
        tools.insertUserByIndex(new User("aaa", 10), 4);
        tools.removeLastItem();
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='second', age=2}"));
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='third', age=3}"));
        assertThat(tools.getUserByIndex(3).toString(), equalTo("User{name='aaa', age=10}"));
    }

    @Test
    public void testRemoveUser() {
        tools.removeUser(first);
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='second', age=2}"));
        assertThat(tools.getUserByIndex(2).toString(), equalTo("User{name='third', age=3}"));
    }

    @Test
    public void testFindUserByName() {
        tools.findUserByName("first");
        assertThat(tools.getUserByIndex(1).toString(), equalTo("User{name='first', age=1}"));
    }

    @Test
    public void testAddArrayOfItems() {
        User[] users = {new User("John", 4), new User("Joe", 5)};
        tools.addArrayOfItems(users);
        assertThat(tools.getUserByIndex(4).toString(), equalTo("User{name='John', age=4}"));
        assertThat(tools.getUserByIndex(5).toString(), equalTo("User{name='Joe', age=5}"));
    }
}
