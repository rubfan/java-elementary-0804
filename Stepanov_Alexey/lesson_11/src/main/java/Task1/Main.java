package Task1;

public class Main {
    public static void main(String[] args) {
        Container workList = addArrayOfUsers();

        User userMiddle = new User("Tommy", 27);
        workList.insertUserByIndex(userMiddle, 5);

        User userTrainee = new User("Mike", 16);
        workList.updateUserByIndex(userTrainee, 3);

        workList.removeUser(userMiddle);

        System.out.println(workList.findUserByName("Mike"));

        System.out.println(workList.getContainerContent());
        workList.getUsersOrderedByAge();
        System.out.println("Age sort" + workList.getContainerContent());
        workList.getUsersOrderedByName();
        System.out.println("Name sort" + workList.getContainerContent());
    }

    public static Container addArrayOfUsers() {
        Container workList = new Container();
        User admin = new User("Tom", 35);
        User manager = new User("Bob", 25);
        User userJunior = new User("Ice", 45);
        User userSuper = new User("Sam", 55);
        workList.addItem(admin);
        workList.addItem(manager);
        workList.addItem(userJunior);
        workList.addItem(userSuper);
        return workList;
    }
}
