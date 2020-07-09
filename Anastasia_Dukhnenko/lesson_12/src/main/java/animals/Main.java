package animals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your animal: ");
        String request = sc.nextLine();
        System.out.println(getInfoAboutAnimal(request));
    }

    public static String getInfoAboutAnimal(String request) {
        Genus animal = new Genus();
        if (animal.genus.equals(request)) {
            return animal.getInfo();
        } else {
            return "Sorry, your animal is not in the system.";
        }
    }
}
