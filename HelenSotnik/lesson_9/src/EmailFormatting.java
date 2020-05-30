import java.util.Scanner;

public class EmailFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String emailAddress = scanner.nextLine();
        emailFormatChange(emailAddress);
    }

    private static void emailFormatChange(String email) {
        email = email.replace("@", "[ at ]");
        email = email.replace(".", "[ dot ]");
        System.out.println("Changed email format: " + email);
    }
}
