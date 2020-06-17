//Написать сласс User имеющий поля name и age
//
//        Написать класс который имеет следующие методы: addUser(User user); addArrayOfUsers(); removeUser(User user); insertUserByIndex(User user, int index); updateUserByIndex(User user, int index); findUserByName(String name); getUsersOrderedByAge(); getUsersOrderedByName();
//
//        Для задачи не использовать масивы а использовать класс Container c 2я полями: User user; Container nextContainer;
public class ObjectBox {
    static Container head = null;
    private int index = -1;

    public static void main(String[] args) {
        ObjectBox ob = new ObjectBox();
        ob.addUser(new User("Vasya", 20));
        ob.addUser(new User("Fedya", 21));
        ob.addUser(new User("Sasha", 22));
        ob.addUser(new User("Petya", 23));
        ob.print();
        ob.removeUser(new User("Sasha", 22));
        ob.print();
        User[] arr = {new User("Sara", 22), new User("Abram", 23)};
        ob.addArrayOfUsers(arr);
        ob.print();
        ob.insertUserByIndex(new User("Marina", 28), 2);
        ob.print();
        ob.updateUserByIndex(new User("Merlin", 29), 2);
        ob.print();
        ob.findUserByName("Sara");
        ob.getUsersOrderedByName();
        ob.getUsersOrderedByAge();
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addUser(User user) {
        Container temp = new Container(user);
        temp.nextContainer = head;
        head = temp;
        index++;
    }

    private void addArrayOfUsers(User[] arr) {
        for (int i = 0; i < arr.length; i++) {
            addUser(arr[i]);
        }
    }

    public void removeLastElement() {
        head = head.nextContainer;
    }

    public void removeUser(User user) {
        Container temp = new Container(user);
        Container cur = head;
        Container prev;
        while (cur.user != null) {
            if (isEmpty()) {
                System.out.println(" User is empty");
                return;
            } else {
                prev = cur;
                cur = cur.nextContainer;
            }

            if (cur.user.getName().equals(temp.user.getName()) && cur.user.getAge() == temp.user.getAge()) {
                prev.nextContainer = cur.nextContainer;
                cur = prev;
                index--;
                return;
            } else {
                head = head.nextContainer;
            }
        }
    }

    public void updateUserByIndex(User user, int index) {
        if (index <= this.index) {
            Container temp = new Container(user);
            Container cur = head;
            Container prev = head;
            if (index == 0) {
                head.user = user;
            } else {
                for (int i = 1; i <= index; i++) {
                    prev = cur;
                    cur = cur.nextContainer;
                }
                cur.user = temp.user;
            }
        } else {
            System.out.println("Index is empty");
        }
    }

    public void insertUserByIndex(User user, int index) {
        if (index <= this.index) {
            Container temp = new Container(user);
            Container cur = head;
            Container prev = head;
            if (index == 0) {
                addUser(user);
            } else {
                for (int i = 1; i <= index; i++) {
                    prev = cur;
                    cur = cur.nextContainer;
                }
                temp.nextContainer = cur;
                prev.nextContainer = temp;
                this.index++;
            }
        } else {
            System.out.println("Index is empty");
        }
    }

    public void findUserByName(String name) {
        Container temp = head;
        while (temp != null) {
            if (temp.user.getName().equals(name)) {
                System.out.println(temp.user);
                System.out.println();
                return;
            } else {
                temp = temp.nextContainer;
            }
        }
    }

    public void getUsersOrderedByName() {
        Container temp = head;
        while (temp != null) {
            System.out.println(temp.user.getName());
            temp = temp.nextContainer;
        }
        System.out.println();
    }

    public void getUsersOrderedByAge() {
        Container temp = head;
        while (temp != null) {
            System.out.println(temp.user.getAge());
            temp = temp.nextContainer;
        }
        System.out.println();
    }

    public void print() {
        Container temp = head;
        while (temp != null) {
            System.out.println(temp.user);
            temp = temp.nextContainer;
        }
        System.out.println();
    }
}

