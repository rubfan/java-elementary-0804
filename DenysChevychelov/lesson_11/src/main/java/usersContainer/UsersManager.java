package usersContainer;

public class UsersManager {
    private int counter;
    private Container head;

    public void addUser(User user) {
        if (this.head == null) {
            this.head = new Container();
            this.head.setUser(user);
        }
        Container temp = new Container();
        temp.setUser(user);
        Container current = this.head;
        if (current != null) {
            while (current.getNextContainer() != null) {
                current = current.getNextContainer();
            }
            current.setNextContainer(temp);
        }
        incrementCounter();
    }

    public void addArrayOfUsers(User[] users) {
        for (User user : users) {
            addUser(user);
        }
    }

    public void removeUser(User user) {
        Container current = this.head;
        for (int i = 0; i < this.counter; i++) {
            if (current.getNextContainer().getUser().equals(user)) {
                current.setNextContainer(current.getNextContainer().getNextContainer());
                decrementCounter();
                removeUser(user);
            }
            current = current.getNextContainer();
        }
    }

    public void insertUserByIndex(User user, int index) {
        Container current = this.head;
        Container temp = new Container();
        temp.setUser(user);
        for (int i = 0; i < index; i++) {
            current = current.getNextContainer();
        }
        temp.setNextContainer(current.getNextContainer());
        current.setNextContainer(temp);
        incrementCounter();
    }

    public void updateUserByIndex(User user, int index) {
        Container temp = new Container();
        temp.setUser(user);
        Container current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNextContainer();
        }
        temp.setNextContainer(current.getNextContainer().getNextContainer());
        current.setNextContainer(temp);
    }

    public User findUserByName(String name) {
        Container current = this.head;
        User userTemp = new User();
        String userName;
        for (int i = 0; i < this.counter; i++) {
            current = current.getNextContainer();
            userName = current.getUser().getName();
            if (userName.equals(name)) {
                userTemp = current.getUser();
            }
        }
        return userTemp;
    }

    public User[] getUsersOrderedByName() {
        boolean isSorted = false;
        User temp1;
        User temp2;
        User userWithLowestName;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < counter - 1; i++) {
                temp1 = getUserByIndex(i);
                temp2 = getUserByIndex(i + 1);
                userWithLowestName = getUserWithLowerName(temp1, temp2);
                if (userWithLowestName.equals(temp2)) {
                    isSorted = false;
                    updateUserByIndex(temp2, i);
                    updateUserByIndex(temp1, i + 1);
                }
            }
        }
        return getArrayUsers();
    }

    public User[] getUsersOrderedByAge() {
        boolean isSorted = false;
        User temp1;
        User temp2;
        User userWithLowestAge;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.counter - 1; i++) {
                temp1 = getUserByIndex(i);
                temp2 = getUserByIndex(i + 1);
                userWithLowestAge = getUserWithLowerAge(temp1, temp2);
                if (userWithLowestAge.equals(temp2)) {
                    isSorted = false;
                    updateUserByIndex(temp2, i);
                    updateUserByIndex(temp1, i + 1);
                }
            }
        }
        return getArrayUsers();
    }

    public User getUserByIndex(int index) {
        Container current = this.head;
        int position = 0;
        while (position <= index) {
            current = current.getNextContainer();
            position++;
        }
        User user = current.getUser();
        return user;
    }


    private User getUserWithLowerName(User firstUser, User secondUser) {
        String firstUserName = firstUser.getName();
        String secondUserName = secondUser.getName();
        int firstLength = firstUserName.length();
        int secondLength = secondUserName.length();
        int minLength = firstLength <= secondLength ? firstLength : secondLength;
        for (int i = 0; i < minLength; i++) {
            char first = firstUserName.charAt(i);
            char second = secondUserName.charAt(i);
            if (first < second) {
                return firstUser;
            }
            if (first > second) {
                return secondUser;
            }
        }
        return firstUser;
    }

    private User getUserWithLowerAge(User firstUser, User secondUser) {
        int firstUserAge = firstUser.getAge();
        int secondUserAge = secondUser.getAge();

        if (firstUserAge <= secondUserAge) {
            return firstUser;
        } else {
            return secondUser;
        }
    }

    private User[] getArrayUsers() {
        Container current;
        current = head;
        User[] sortedUsers = new User[counter];
        for (int i = 0; i < counter; i++) {
            sortedUsers[i] = current.getNextContainer().getUser();
            current = current.getNextContainer();
        }
        return sortedUsers;
    }

    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public int getSizeOfContainer() {
        return this.counter;
    }


}