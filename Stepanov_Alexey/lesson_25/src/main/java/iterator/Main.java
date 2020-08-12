package iterator;

public class Main {

    public static void main(String[] args) {
        UserList users = new UserList();
        Iterator iterator = users.getIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}