import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e-mail: ");
        String input = scanner.next();
        StringBuilder inputUpdated = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '@') {
                inputUpdated.append("[ at ]");
            } else if (input.charAt(i) == '.') {
                inputUpdated.append("[ dot ]");
            } else {
                inputUpdated.append(input.charAt(i));
            }
        }
        System.out.println(inputUpdated);
    }
}
