import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words (space delimited): ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        String inputUpdated = "";
        for (String word : array) {
            if (word.length() > 4) {
                inputUpdated = inputUpdated + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1) + " ";
            } else {
                inputUpdated = inputUpdated + word + " ";
            }
        }
        System.out.println(inputUpdated);
    }
}
