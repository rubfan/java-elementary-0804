package builder;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student.Builder()
                .setFirstName("Ben")
                .setLastName("Hanscom")
                .setGender("Male")
                .setAge(12)
                .build();

        System.out.println(s1);

        Student s2 = new Student.Builder()
                .setFirstName("Beverly")
                .setLastName("Marsh")
                .setGender("Female")
                .setAge(13)
                .build();

        System.out.println(s2);
    }
}
