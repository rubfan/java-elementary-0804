package usersContainer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UsersManagerTest {
    UsersManager usersManager = new UsersManager();
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();
    User user4 = new User();

    @Before
    public void initUsers() {
        user1.setName("FIRST USER");
        user1.setAge(10);
        user2.setName("SECOND USER");
        user2.setAge(20);
        user3.setName("THIRD USER");
        user3.setAge(30);
        user4.setName("FOURTH USER");
        user4.setAge(40);

    }

    @Test
    public void testAddUser() {
        usersManager.addUser(user1);
        usersManager.addUser(user2);
        usersManager.addUser(user3);
        usersManager.addUser(user4);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(1).toString(), equalTo("User{name='SECOND USER', age=20}"));
        assertThat(usersManager.getUserByIndex(2).toString(), equalTo("User{name='THIRD USER', age=30}"));
        assertThat(usersManager.getUserByIndex(3).toString(), equalTo("User{name='FOURTH USER', age=40}"));
    }

    @Test
    public void testAddArrayOfUsers() {
        User[] users = new User[4];
        users[0] = user4;
        users[1] = user3;
        users[2] = user2;
        users[3] = user1;
        usersManager.addArrayOfUsers(users);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FOURTH USER', age=40}"));
        assertThat(usersManager.getUserByIndex(1).toString(), equalTo("User{name='THIRD USER', age=30}"));
        assertThat(usersManager.getUserByIndex(2).toString(), equalTo("User{name='SECOND USER', age=20}"));
        assertThat(usersManager.getUserByIndex(3).toString(), equalTo("User{name='FIRST USER', age=10}"));
    }

    @Test
    public void removeUserSizeOfContainerShouldBeLessBy1() {
        usersManager.addUser(user1);
        usersManager.addUser(user2);
        usersManager.addUser(user3);
        usersManager.addUser(user4);
        usersManager.removeUser(user2);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(1).toString(), equalTo("User{name='THIRD USER', age=30}"));
        assertThat(usersManager.getUserByIndex(2).toString(), equalTo("User{name='FOURTH USER', age=40}"));
        assertThat(usersManager.getSizeOfContainer(), equalTo(3));

    }

    @Test
    public void removeUserSizeOfContainerShouldBeLessBy2IfSameUsers() {
        usersManager.addUser(user2);
        usersManager.addUser(user2);
        usersManager.addUser(user2);
        usersManager.addUser(user4);
        usersManager.removeUser(user2);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FOURTH USER', age=40}"));
        assertThat(usersManager.getSizeOfContainer(), equalTo(1));

    }

    @Test
    public void insertUserByIndexSizeOfContainerShouldBeGreaterBy1AndUserInfoAdded() {
        usersManager.addUser(user1);
        usersManager.addUser(user2);
        usersManager.addUser(user3);
        usersManager.addUser(user4);
        usersManager.insertUserByIndex(user1, 2);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(1).toString(), equalTo("User{name='SECOND USER', age=20}"));
        assertThat(usersManager.getUserByIndex(2).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(3).toString(), equalTo("User{name='THIRD USER', age=30}"));
        assertThat(usersManager.getUserByIndex(4).toString(), equalTo("User{name='FOURTH USER', age=40}"));
        assertThat(usersManager.getSizeOfContainer(), equalTo(5));
    }

    @Test
    public void updateUserByIndexSizeOfContainerShouldBeSameAndUserInfoUpdate() {
        usersManager.addUser(user1);
        usersManager.addUser(user2);
        usersManager.addUser(user3);
        usersManager.addUser(user4);
        usersManager.updateUserByIndex(user1, 2);
        assertThat(usersManager.getUserByIndex(0).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(1).toString(), equalTo("User{name='SECOND USER', age=20}"));
        assertThat(usersManager.getUserByIndex(2).toString(), equalTo("User{name='FIRST USER', age=10}"));
        assertThat(usersManager.getUserByIndex(3).toString(), equalTo("User{name='FOURTH USER', age=40}"));
        assertThat(usersManager.getSizeOfContainer(), equalTo(4));
    }

    @Test
    public void findUserByName() {
        usersManager.addUser(user1);
        usersManager.addUser(user2);
        usersManager.addUser(user3);
        usersManager.addUser(user4);
        assertThat(usersManager.findUserByName("SECOND USER").toString(),
                equalTo("User{name='SECOND USER', age=20}"));
    }

    @Test
    public void getUsersOrderedByAgeReturnSortedByAgeArrayOfUsers() {
        user4.setAge(85);
        usersManager.addUser(user4);
        user3.setAge(55);
        usersManager.addUser(user3);
        user2.setAge(45);
        usersManager.addUser(user2);
        user1.setAge(15);
        usersManager.addUser(user1);
        User[] sortedUsersArray = usersManager.getUsersOrderedByAge();
        assertThat(sortedUsersArray[0], equalTo(user1));
        assertThat(sortedUsersArray[1], equalTo(user2));
        assertThat(sortedUsersArray[2], equalTo(user3));
        assertThat(sortedUsersArray[3], equalTo(user4));
    }

    @Test
    public void getUsersOrderedByNameReturnSortedByNameArrayOfUsers() {
        user4.setName("aaa");
        usersManager.addUser(user4);
        user3.setName("aab");
        usersManager.addUser(user3);
        user2.setName("ccc");
        usersManager.addUser(user2);
        user1.setName("ab");
        usersManager.addUser(user1);
        User[] sortedUsersArray = usersManager.getUsersOrderedByName();
        assertThat(sortedUsersArray[0], equalTo(user4));
        assertThat(sortedUsersArray[1], equalTo(user3));
        assertThat(sortedUsersArray[2], equalTo(user1));
        assertThat(sortedUsersArray[3], equalTo(user2));
    }
}