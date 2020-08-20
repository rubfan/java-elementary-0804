package task1;

public class App {
    private Container firstContainer = null;
    private int length = 0;

    public void addUser(User user) {
        if (this.firstContainer == null) {
            this.firstContainer = new Container(user);
        }
        Container newUser = new Container(user);
        Container current = firstContainer;
        if (current != null) {
            while (current.nextContainer != null) {
                current = current.getNextContainer();
            }
            current.nextContainer = newUser;
        }
        this.length++;
    }

    public void addArrayOfUsers(User[] users) {
        for (User user : users) {
            this.addUser(user);
        }
    }

    public void removeUser(User user) {
        Container currentUser = firstContainer;
        for (int i = 0; i < length; i++) {
            if (firstContainer == null) {
                System.out.println("No user is here.");
            }
            if (currentUser.user.equals(user)) {
                currentUser.user = currentUser.nextContainer.user;
                currentUser.nextContainer = currentUser.nextContainer.nextContainer;
                this.length--;
            }
            currentUser = currentUser.nextContainer;
        }
    }

    public User getUserByIndex(int index) {
        Container current = firstContainer;
        int position = 0;
        while (position < index) {
            current = current.nextContainer;
            position++;
        }
        return current.user;
    }

    public void insertUserByIndex(User user, int index) {
        Container container = new Container(user);
        Container currentUser = firstContainer;
        for (int i = 1; i < index; i++) {
            currentUser = currentUser.nextContainer;
        }
        container.nextContainer = currentUser.nextContainer;
        currentUser.nextContainer = container;
        this.length++;
    }

    public void updateUserByIndex(User user, int index) {
        Container container = new Container(user);
        Container currentUser = firstContainer;
        for (int i = 0; i < index - 1; i++) {
            currentUser = currentUser.nextContainer;
        }

        container.nextContainer = container.nextContainer.nextContainer;
        currentUser.nextContainer = container;
    }

    public void findUserByName(String name) {
        Container currentUser = firstContainer;
        User user = new User(name);
        Container container = new Container(user);
        for (int i = 0; i < length; i++) {
            if (firstContainer == null) {
                System.out.println("User is empty");
            }
            if (currentUser.user.getName().equals(container.user.getName())) {
                System.out.println(currentUser.user);
            }
            currentUser = currentUser.nextContainer;
        }
    }

    public void getUsersOrderedByAge() {
        for (int i = 0; i < this.length-1; i++) {
            Container newContainer = firstContainer;
            Container nextNewContainer = firstContainer.nextContainer;

            for (int j = 0; j < this.length - i; j++) {
                User a = getUserByIndex(j);
                User b = getUserByIndex(j + 1);

                if (a.getAge() > b.getAge()) {
                    newContainer.user = b;
                    nextNewContainer.user = a;
                }
                newContainer = newContainer.nextContainer;
                nextNewContainer = nextNewContainer.nextContainer;
            }
        }
    }

    public void getUsersOrderedByName() {
        for (int i = 0; i < length - 1; i++) {
            Container currentUser = firstContainer;
            Container nextUser = currentUser.nextContainer;

            for (int j = 0; j < length - i; j++) {
                User a = getUserByIndex(j);
                User b = getUserByIndex(j + 1);

                if (a.getName().charAt(0) > b.getName().charAt(0)) {
                    currentUser.user = b;
                    nextUser.user = a;
                }
                currentUser = currentUser.nextContainer;
                nextUser = nextUser.nextContainer;
            }
        }
    }
}
