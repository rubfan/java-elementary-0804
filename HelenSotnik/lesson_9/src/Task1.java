import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scanner.nextLine();

        email = email.replace("@", "[ at ]");
        email = email.replace(".", "[ dot ]");
        System.out.println("Changed email format: " + email);
    }
}
