package Task1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ContainerTest {
    Container test = new Container();
    User admin = new User("Oleg", 72);
    User supply = new User("Igor", 35);
    User marketing = new User("Margo", 55);
    User sales = new User("Alex", 18);
    User finance = new User("Alice", 38);
    User service = new User("Bob", 47);

    @Before
    public void init() {
        Container.container = null;
        test
                .addItem(admin)
                .addItem(supply)
                .addItem(marketing)
                .addItem(sales)
                .addItem(finance);
    }

    @Test
    public void testAddItem() {
        String result = test.addItem(service).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18][Alice:38][Bob:47]"));
    }

    @Test
    public void testRemoveExistingUserMiddle() {
        String result = test.removeUser(marketing).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Alex:18][Alice:38]"));
    }

    @Test
    public void testRemoveExistingUserFirstPosition() {
        String result = test.removeUser(admin).getContainerContent();
        assertThat(result, equalTo("[Igor:35][Margo:55][Alex:18][Alice:38]"));
    }

    @Test
    public void testRemoveExistingUserLastPosition() {
        String result = test.removeUser(finance).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18]"));
    }

    @Test
    public void testInsertUserByIndexMiddle() {
        String result = test.insertUserByIndex(service, 4).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Bob:47][Alex:18][Alice:38]"));
    }

    @Test
    public void testInsertUserByIndexFirstPosition() {
        String result = test.insertUserByIndex(service, 1).getContainerContent();
        assertThat(result, equalTo("[Bob:47][Oleg:72][Igor:35][Margo:55][Alex:18][Alice:38]"));
    }

    @Test
    public void testInsertUserByIndexLastPosition() {
        String result = test.insertUserByIndex(service, 6).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18][Alice:38][Bob:47]"));
    }

    @Test
    public void testInsertUserByIndexLastOutRange() {
        String result = test.insertUserByIndex(service, 10).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18][Alice:38]"));
    }

    @Test
    public void testUpdateUserByIndexMiddle() {
        String result = test.updateUserByIndex(service, 3).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Bob:47][Alex:18][Alice:38]"));
    }

    @Test
    public void testUpdateUserByIndexFirstPosition() {
        String result = test.updateUserByIndex(service, 1).getContainerContent();
        assertThat(result, equalTo("[Bob:47][Igor:35][Margo:55][Alex:18][Alice:38]"));
    }

    @Test
    public void testUpdateUserByIndexLastPosition() {
        String result = test.updateUserByIndex(service, 5).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18][Bob:47]"));
    }

    @Test
    public void testUpdateUserByIndexOutRange() {
        String result = test.updateUserByIndex(service, 10).getContainerContent();
        assertThat(result, equalTo("[Oleg:72][Igor:35][Margo:55][Alex:18][Alice:38]"));
    }

    @Test
    public void testFindUserByNameSingleMatch() {
        String result = test.findUserByName("Igor");
        assertThat(result, equalTo("Found at position: 2\n"));
    }

    @Test
    public void testFindUserByNameMultipleMatch() {
        Container.container = null;
        User service2 = new User("Bob", 37);
        test.addItem(admin).addItem(supply).addItem(service).addItem(sales).addItem(service2);
        String result = test.findUserByName("Bob");
        assertThat(result, equalTo("Found at position: 3\nFound at position: 5\n"));
    }

    @Test
    public void testFindUserByNameUserNotFound() {
        String result = test.findUserByName("Adam");
        assertThat(result, equalTo("Name not found"));
    }

    @Test
    public void testGetUsersOrderedByAge() {
        String result = test.getUsersOrderedByAge().getContainerContent();
        assertThat(result, equalTo("[Alex:18][Igor:35][Alice:38][Margo:55][Oleg:72]"));
    }

    @Test
    public void testGetUsersOrderedByName() {
        String result = test.getUsersOrderedByName().getContainerContent();
        assertThat(result, equalTo("[Alex:18][Alice:38][Igor:35][Margo:55][Oleg:72]"));
    }
}
