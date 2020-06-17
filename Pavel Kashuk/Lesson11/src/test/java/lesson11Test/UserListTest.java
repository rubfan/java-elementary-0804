package lesson11Test;

import lesson11.Container;
import lesson11.User;
import lesson11.UserList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class UserListTest {
    UserList userList = new UserList();
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();

    @Before
    public void init() {
        user1.setName("Mike");
        user1.setAge(20);
        user2.setName("Sten");
        user2.setAge(25);
        user3.setName("Ben");
        user3.setAge(30);
    }

    @Test
    public void addUsersToContainer() {
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        Assert.assertThat(userList.getUserByIndex(0).toString(), equalTo("User{name='Mike', age=20}"));
        Assert.assertThat(userList.getUserByIndex(1).toString(), equalTo("User{name='Sten', age=25}"));
        Assert.assertThat(userList.getUserByIndex(2).toString(), equalTo("User{name='Ben', age=30}"));
        Assert.assertThat(userList.getContainerSize(), equalTo(3));
    }

    @Test
    public void removeUsersInContainer() {
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.removeUser(user2);
        Assert.assertThat(userList.getUserByIndex(0).toString(), equalTo("User{name='Mike', age=20}"));
        Assert.assertThat(userList.getUserByIndex(1).toString(), equalTo("User{name='Ben', age=30}"));
        Assert.assertThat(userList.getContainerSize(), equalTo(2));
    }

    @Test
    public void addArrayOfUsersToContainer() {
        Container usersContainer = new Container();
        usersContainer.setUser(new User("Beverley", 22));
        usersContainer.setNextContainer(new Container(new User("Richy", 20), null));
        userList.addArrayOfUsers(usersContainer);
        Assert.assertThat(userList.getUserByIndex(0).toString(), equalTo("User{name='Beverley', age=22}"));
        Assert.assertThat(userList.getUserByIndex(1).toString(), equalTo("User{name='Richy', age=20}"));
    }

    @Test
    public void insertUsersByIndexToContainer() {
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        User user4 = new User("Eddi", 22);
        userList.insertUserByIndex(user4, 1);
        Assert.assertThat(userList.getUserByIndex(0).toString(), equalTo("User{name='Mike', age=20}"));
        Assert.assertThat(userList.getUserByIndex(1).toString(), equalTo("User{name='Eddi', age=22}"));
        Assert.assertThat(userList.getUserByIndex(2).toString(), equalTo("User{name='Sten', age=25}"));
        Assert.assertThat(userList.getUserByIndex(3).toString(), equalTo("User{name='Ben', age=30}"));
        Assert.assertThat(userList.getContainerSize(), equalTo(4));
    }

    @Test
    public void updateUsersByIndexToContainer() {
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        User user4 = new User("Eddi", 22);
        userList.updateUserByIndex(user4, 1);
        Assert.assertThat(userList.getUserByIndex(0).toString(), equalTo("User{name='Mike', age=20}"));
        Assert.assertThat(userList.getUserByIndex(1).toString(), equalTo("User{name='Eddi', age=22}"));
        Assert.assertThat(userList.getUserByIndex(2).toString(), equalTo("User{name='Ben', age=30}"));
        Assert.assertThat(userList.getContainerSize(), equalTo(3));
    }

    @Test
    public void findUsersByNameInContainer() {
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        Assert.assertThat(userList.findUserByName("Ben").toString(),
                equalTo("User{name='Ben', age=30}"));
    }

    @Test
    public void getUsersOrderedByAgeInContainer() {
        user1.setAge(30);
        userList.addUser(user1);
        user2.setAge(25);
        userList.addUser(user2);
        user3.setAge(20);
        userList.addUser(user3);
        userList.getUsersOrderedByAge();
        Assert.assertThat(userList.getUserByIndex(0), is(user3));
        Assert.assertThat(userList.getUserByIndex(1), is(user2));
        Assert.assertThat(userList.getUserByIndex(2), is(user1));
    }

    @Test
    public void getUsersOrderedByNameInContainer() {
        user1.setName("Richy");
        userList.addUser(user1);
        user2.setName("Eddi");
        userList.addUser(user2);
        user3.setName("Ben");
        userList.addUser(user3);
        userList.getUsersOrderedByName();
        Assert.assertThat(userList.getUserByIndex(0), is(user3));
        Assert.assertThat(userList.getUserByIndex(1), is(user2));
        Assert.assertThat(userList.getUserByIndex(2), is(user1));
    }
}
