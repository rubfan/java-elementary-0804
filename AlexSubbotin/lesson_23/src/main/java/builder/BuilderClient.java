package builder;

public class BuilderClient {
    public static void main(String[] args) {
        User newUser = User.newUser()
                .setAge((byte) 37)
                .setBornCity("Kyiv")
                .setBornCountry("Ukraine")
                .setName("Petya").build();

        System.out.println(newUser.toString());

        User second = User.newUser()
                .setAge((byte) 20)
                .setName("Vasya")
                .setFootSize((byte) 45)
                .setWeight((byte) 80)
                .build();
        System.out.println(second);
    }
}
