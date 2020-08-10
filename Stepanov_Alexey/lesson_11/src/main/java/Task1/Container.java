package Task1;

public class Container {
    public static Container container;
    User user;
    Container nextContainer;

    public Container addItem(User user) {
        Container newItem = new Container();
        newItem.user = user;
        newItem.nextContainer = null;

        if (container == null) {
            container = newItem;
        } else {
            Container last = container;
            while (last.nextContainer != null) {
                last = last.nextContainer;
            }
            last.nextContainer = newItem;
        }
        return container;
    }

    public Container removeUser(User user) {
        Container currentItem = container;
        Container previousItem = null;
        if (currentItem.user.equals(user)) {
            container = currentItem.nextContainer;
            return container;
        }
        while (currentItem != null) {
            if (currentItem.user.equals(user)) {
                previousItem.nextContainer = currentItem.nextContainer;
            }
            previousItem = currentItem;
            currentItem = currentItem.nextContainer;
        }
        return container;
    }

    public Container insertUserByIndex(User user, int index) {
        int position = 1;
        Container newItem = new Container();
        newItem.user = user;
        newItem.nextContainer = null;
        Container currentItem = container;
        Container previousItem = null;
        if (index == 1) {
            newItem.nextContainer = currentItem;
            container = newItem;
            return container;
        }
        while (currentItem != null) {
            if (position == index) {
                previousItem.nextContainer = newItem;
                newItem.nextContainer = currentItem;
            }
            previousItem = currentItem;
            currentItem = currentItem.nextContainer;
            position++;
        }
        if (position == index) {
            previousItem.nextContainer = newItem;
        }
        return container;
    }

    public Container updateUserByIndex(User user, int index) {
        int position = 1;
        Container currentItem = container;
        while (currentItem != null) {
            if (position == index) {
                currentItem.user = user;
                return container;
            }
            currentItem = currentItem.nextContainer;
            position++;
        }
        return container;
    }

    public String findUserByName(String name) {
        int position = 1;
        String result = "";
        Container currentItem = container;
        while (currentItem != null) {
            String currentName = currentItem.user.getName();
            if (currentName.equals(name)) {
                result += "Found at position: " + position + "\n";
            }
            currentItem = currentItem.nextContainer;
            position++;
        }
        if (result.equals("")) {
            result = "Name not found";
        }
        return result;
    }

    public Container getUsersOrderedByAge() {
        int n = getLen();
        for (int i = 0; i < n - 1; i++) {
            Container currentItem = container;
            Container nextItem = container.nextContainer;
            for (int j = 0; j < n - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);
                if (u1.getAge() > u2.getAge()) {
                    currentItem.user = u2;
                    nextItem.user = u1;
                }
                currentItem = currentItem.nextContainer;
                nextItem = nextItem.nextContainer;
            }
        }
        return container;
    }

    public Container getUsersOrderedByName() {
        int n = getLen();
        for (int i = 0; i < n - 1; i++) {
            Container currentItem = container;
            Container nextItem = container.nextContainer;
            for (int j = 0; j < n - i - 1; j++) {
                User u1 = getUserByIndex(j);
                User u2 = getUserByIndex(j + 1);
                if (u1.getName().compareTo(u2.getName()) > 0) {
                    currentItem.user = u2;
                    nextItem.user = u1;
                }
                currentItem = currentItem.nextContainer;
                nextItem = nextItem.nextContainer;
            }
        }
        return container;
    }

    public String getContainerContent() {
        Container currItem = container;
        String result = "";
        while (currItem != null) {
            result += "[" + currItem.user.getName() + ":" + currItem.user.getAge() + "]";
            currItem = currItem.nextContainer;
        }
        return result;
    }

    private int getLen() {
        int len = 0;
        Container currentItem = container;
        while (currentItem != null) {
            currentItem = currentItem.nextContainer;
            len++;
        }
        return len;
    }

    private User getUserByIndex(int index) {
        int position = 0;
        Container currentItem = container;
        while (currentItem != null) {
            if (position == index) {
                return currentItem.user;
            }
            currentItem = currentItem.nextContainer;
            position++;
        }
        return user;
    }
}
