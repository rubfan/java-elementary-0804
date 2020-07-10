package HW11Task1;

public class UserApp {
    User user;
    Container pointer = null;
    int numUser = 0;

    public int getNumUser() {
        return numUser;
    }

    public User addUser(User user) {
        Container container = new Container(user);
        container.nextContainer = pointer;
        pointer = container;
        numUser++;
        return user;

    }

    public int addArrayOfUsers(User[] arrUsers) {
        for (User arrUser : arrUsers) {
            addUser(arrUser);
        }
        return numUser++;
    }

    public int removeUser(User user) {
        Container currrent = pointer;
        Container previous = pointer;
        for (int i = 0; i < numUser; i++) {
            if (user.equals(currrent.getUser())) {
                previous.setNextContainer(currrent.getNextContainer());
            }
            numUser--;
            previous = currrent;
            currrent = currrent.getNextContainer();
        }
        return numUser;
    }

    public void insertUserByIndex(User user, int index) {
        Container container = this.getcontainerIndex(index - 1);
        Container insertContainer = new Container(user);
        insertContainer.setNextContainer(container.getNextContainer());
        container.setNextContainer(insertContainer);
        numUser++;

    }

    public void updateUserByIndex(User user, int index) {
        this.getcontainerIndex(index).setUser(user);
    }

    private Container getcontainerIndex(int index) {
        Container container = this.pointer;
        for (int i = 0; i < index; i++) {
            container = container.getNextContainer();
        }
        return container;
    }

    public User findUserByName(String name) {
        Container container = this.pointer;
        for (int i = 0; i < this.numUser; i++) {
            if (name.equals(container.getUser().getName())) {
                return container.getUser();
            }
            container = container.getNextContainer();
        }
        return user;
    }

    public User getUserByIndex(int index) {
        Container container = this.pointer;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return container.user;
            }
            container = container.nextContainer;
        }
        return null;
    }

    public void getUsersOrderedByAge() {
        for (int i = 0; i < numUser - 1; i++) {
            Container first = pointer;
            Container second = pointer.nextContainer;
            for (int j = 0; j < numUser - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);
                if (u1.getAge() > u2.getAge()) {
                    first.user = u2;
                    second.user = u1;
                }
                first = first.nextContainer;
                second = second.nextContainer;
            }
        }
    }

    public void getUsersOrderedByName() {
        for (int i = 0; i < this.numUser; i++) {
            Container first = this.pointer;
            Container second = this.pointer.getNextContainer();
            for (int j = 0; j < this.numUser - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);
                if (u1.getName().compareTo(u2.getName()) > 0) {
                    first.setUser(u2);
                    second.setUser(u1);
                }
                first = first.getNextContainer();
                second = second.getNextContainer();
            }
        }
    }
}

