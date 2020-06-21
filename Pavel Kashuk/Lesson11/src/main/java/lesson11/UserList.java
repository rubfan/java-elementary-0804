package lesson11;
/*
Написать класса который имеет следующие методы:
addUser(User user);
addArrayOfUsers();
removeUser(User user);
insertUserByIndex(User user, int index);
updateUserByIndex(User user, int index);
findUserByName(String name);
getUsersOrderedByAge();
getUsersOrderedByName();
 */

public class UserList {
    private Container head;
    private int size;

    public UserList() {
        this.head = new Container();
    }

    public void addUser(User user) {
        Container innerContainer = this.head;

        while (innerContainer.getNextContainer() != null) {
            innerContainer = innerContainer.getNextContainer();
        }
        innerContainer.setUser(user);
        innerContainer.setNextContainer(new Container());
        size++;
    }

    public void addArrayOfUsers(Container userContainers) {
        Container innerContainer = this.head;

        while (innerContainer.getNextContainer() != null) {
            innerContainer = innerContainer.getNextContainer();
        }
        innerContainer.setUser(userContainers.getUser());
        innerContainer.setNextContainer(userContainers.getNextContainer());
        size++;

        Container countContainer = userContainers;

        while (countContainer.getNextContainer() != null) {
            countContainer = countContainer.getNextContainer();
            size++;
        }
    }

    public void removeUser(User user) {
        Container innerContainer = this.head;
        do {
            if (innerContainer.getUser() != null && innerContainer.getUser().equals(user)) {
                innerContainer.setUser(innerContainer.getNextContainer().getUser());
                innerContainer.setNextContainer(innerContainer.getNextContainer().getNextContainer());
                size--;
                return;
            }
            innerContainer = innerContainer.getNextContainer();

        } while (innerContainer.getNextContainer() != null);
    }

    public void insertUserByIndex(User user, int index) {
        int counter = 0;
        Container innerContainer = this.head;
        do {
            if (counter == index) {
                Container temporaryContainer = new Container();
                temporaryContainer.setUser(innerContainer.getUser());
                temporaryContainer.setNextContainer(innerContainer.getNextContainer());
                innerContainer.setUser(user);
                innerContainer.setNextContainer(temporaryContainer);
                size++;
            }
            innerContainer = innerContainer.getNextContainer();
            counter++;

        } while (innerContainer.getNextContainer() != null);
    }

    public void updateUserByIndex(User user, int index) {
        int counter = 0;
        Container innerContainer = this.head;
        do {
            if (counter == index) {
                innerContainer.setUser(user);
            }
            innerContainer = innerContainer.getNextContainer();
            counter++;

        } while (innerContainer.getNextContainer() != null);
    }

    public User findUserByName(String name) {
        Container innerContainer = this.head;
        do {
            if (innerContainer.getUser() != null && innerContainer.getUser().getName().equals(name)) {
                return innerContainer.getUser();
            }
            innerContainer = innerContainer.getNextContainer();

        } while (innerContainer.getNextContainer() != null);
        return null;
    }

    public void getUsersOrderedByAge() {
        for (int i = 0; i < this.size - 1; i++) {
            Container innerContainer = this.head;
            Container nexInnerContainer = this.head.getNextContainer();

            for (int j = 0; j < this.size - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);

                if (u1.getAge() > u2.getAge()) {
                    innerContainer.setUser(u2);
                    nexInnerContainer.setUser(u1);
                }
                innerContainer = innerContainer.getNextContainer();
                nexInnerContainer = nexInnerContainer.getNextContainer();
            }
        }
    }

    public void getUsersOrderedByName() {
        for (int i = 0; i < this.size; i++) {
            Container innerContainer = this.head;
            Container nextInnerContainer = this.head.getNextContainer();

            for (int j = 0; j < this.size - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);

                if (u1.getName().compareTo(u2.getName()) > 0) {
                    innerContainer.setUser(u2);
                    nextInnerContainer.setUser(u1);
                }
                innerContainer = innerContainer.getNextContainer();
                nextInnerContainer = nextInnerContainer.getNextContainer();
            }
        }
    }

    public User getUserByIndex(int index) {
        Container innerContainer = head;
        int position = 0;

        while (head != null) {
            if (position == index) {
                return innerContainer.getUser();
            }
            innerContainer = innerContainer.getNextContainer();
            position++;
        }
        return innerContainer.getUser();
    }

    public int getContainerSize() {
        return this.size;
    }
}
