import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String mail = "person@gmail.com";
        Scanner scanner = new Scanner(System.in);

        createArr(mail);
        createArr(scanner.nextLine());
    }

    public static void createArr(String mail) {
        String arrMail = mail.replace("@", "[ at ]").replace(".", "[ dot ]");
        System.out.println("arr = " + arrMail);
    }
}
