package iterator;

public class Client {

    public static void main(String[] args) {
        String[] skills = {"Java Core", "OOP", "Maven", "SQL", "Algorithms", "Patterns"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Alex", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
