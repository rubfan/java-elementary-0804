package Task1;

public class ContainerTools {
    protected static Container head = null;
    protected int length = 0;

    public void addItem(User user) {
        if (head == null) {
            head = new Container(user);
        }
        Container newItem = new Container(user);
        Container current = head;
        if (current != null) {
            while (current.nextContainer != null) {
                current = current.getNextContainer();
            }
            current.nextContainer = newItem;
        }
        length++;

    }

    public void addArrayOfItems(User[] user) {
        for (User element :
                user) {
            addItem(element);
        }
    }


    public void removeUser(User user) {
        Container currentItem = head;
        for (int i = 0; i < length; i++) {
            if (head == null) {
                System.out.println("User is empty");
                return;
            }
            if (currentItem.user.equals(user)) {
                currentItem.user = currentItem.nextContainer.user;
                currentItem.nextContainer = currentItem.nextContainer.nextContainer;
                length--;
                return;
            }
            currentItem = currentItem.nextContainer;
        }
    }
    public User getUserByIndex(int index) {
        Container current = head;
        int position = 0;
        while (position < index) {
            current = current.nextContainer;
            position++;
        }
        User user = current.user;
        return user;
    }
    public void insertUserByIndex(User user, int index) {
        Container temporary = new Container(user);
        Container currentItem = head;

        for (int i = 1; i < index; i++) {
            currentItem = currentItem.nextContainer;
        }
        temporary.nextContainer = currentItem.nextContainer;
        currentItem.nextContainer = temporary;
        this.length++;
    }

    public void updateUserByIndex(User user, int index) {
        Container temporary = new Container(user);
        Container currentItem = head;
        for (int i = 0; i < index-1; i++) {
            currentItem = currentItem.nextContainer;
        }

        temporary.nextContainer = currentItem.nextContainer.nextContainer;
        currentItem.nextContainer = temporary;
    }

    public void findUserByName(String name) {
        Container currentItem = head;
        User us = new User(name);
        Container temporary = new Container(us);
        for (int i = 0; i < length; i++) {
            if (head == null) {
                System.out.println("User is empty");
                return;
            }
            if (currentItem.user.getName().equals(temporary.user.getName())) {
                System.out.println(currentItem.user);
                return;
//                return currentItem.user.getAge();
            }
            currentItem = currentItem.nextContainer;
        }
//        return currentItem.user.getAge();

    }

    public void getUsersOrderedByAge() {
        for (int i = 0; i < this.length-1; i++) {
            Container innerContainer = head;
            Container nexInnerContainer = head.nextContainer;

            for (int j = 0; j < this.length - i; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);

                if (u1.getAge() > u2.getAge()) {
                    innerContainer.user = u2;
                    nexInnerContainer.user = u1;
                }
                innerContainer = innerContainer.nextContainer;
                nexInnerContainer = nexInnerContainer.nextContainer;
            }
        }
    }

    public void getUsersOrderedByName() {
        for (int i = 0; i < length - 1; i++) {
            Container currentItem = head;
            Container nextItem = currentItem.nextContainer;

            for (int j = 0; j < length - i; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);

                if (u1.getName().charAt(0) > u2.getName().charAt(0)) {
                    currentItem.user = u2;
                    nextItem.user = u1;
                }
                currentItem = currentItem.nextContainer;
                nextItem = nextItem.nextContainer;
            }
        }
    }

    public void removeLastItem() {
        head = head.nextContainer;
    }

    public void print() {
        Container temporary = head;
        while (temporary != null) {
            System.out.println(temporary.user);
            temporary = temporary.nextContainer;
        }
        System.out.println("--------------------");
    }

    public int getLen() {
        int len = 0;
        Container currentItem = head;
        while (currentItem != null) {
            currentItem = currentItem.nextContainer;
            len++;
        }
        return len;
    }
}