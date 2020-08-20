
import HW11Task1.User;
import HW11Task1.UserApp;
import org.junit.Assert;
import org.junit.Test;

public class HW11Task1Test {


    UserApp userApp = new UserApp();
    User userAlena = new User("Alena", 23);
    User userOleg = new User("Oleg", 24);
    User userTanya = new User("Tanya", 32);
    User userVasya = new User("Vasya", 20);
    User userKolea = new User("Kolea", 38);

    @Test
    public void testAddUser() {
        UserApp userApp = new UserApp();
        userApp.addUser(userAlena);
        userApp.addUser(userOleg);
        Assert.assertEquals(userApp.addUser(userAlena), userAlena);
        Assert.assertEquals(userApp.addUser(userOleg), userOleg);
    }

    @Test
    public void testAddArrayOfUsers() {
        User[] arrUser = new User[3];
        arrUser[0] = userVasya;
        arrUser[1] = userKolea;
        arrUser[2] = userTanya;

        Assert.assertEquals(3, userApp.addArrayOfUsers(arrUser));
        Assert.assertEquals(userVasya, userApp.findUserByName("Vasya"));
    }

    @Test
    public void testRemoveUser() {
        User[] arrUser = new User[3];
        arrUser[0] = userVasya;
        arrUser[1] = userKolea;
        arrUser[2] = userTanya;
        Assert.assertEquals(3, userApp.addArrayOfUsers(arrUser));
        Assert.assertEquals(2, userApp.removeUser(userKolea));
    }


    @Test
    public void testInsertUserByIndex() {
        userApp.addUser(userOleg);
        userApp.insertUserByIndex(userTanya, 1);
        Assert.assertEquals(3, userApp.getNumUser());
        Assert.assertEquals(userTanya, userApp.getUserByIndex(1));
    }

    @Test
    public void testUpdateUserByIndex() {
        userApp.addUser(userAlena);
        userApp.addUser(userOleg);
        userApp.addUser(userVasya);
        userApp.addUser(userKolea);
        userApp.addUser(userTanya);
        userApp.updateUserByIndex(userTanya, 3);
        Assert.assertEquals(userTanya, userApp.getUserByIndex(3));
    }

    @Test
    public void testGetUsersOrderedBy() {
        userApp.addUser(userAlena);
        userApp.addUser(userVasya);
        userApp.addUser(userKolea);

        userApp.getUsersOrderedByAge();
        Assert.assertEquals(userVasya, userApp.getUserByIndex(0));
        Assert.assertEquals(userAlena, userApp.getUserByIndex(1));
        Assert.assertEquals(userKolea, userApp.getUserByIndex(2));

        userApp.getUsersOrderedByName();
        Assert.assertEquals(userAlena, userApp.getUserByIndex(0));
        Assert.assertEquals(userKolea, userApp.getUserByIndex(1));
        Assert.assertEquals(userVasya, userApp.getUserByIndex(2));
    }
}


