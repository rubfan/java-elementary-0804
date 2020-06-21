import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words (without spaces): ");
        String input = scanner.next();
        String[] words = input.split(",");
        int count = 0;
        for (String word : words) {
            if (word.equals(wordReverse(word))) {
                count++;
            }
        }
        System.out.println("There are " + count + " palindromes in the text");
    }

    private static String wordReverse(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }
}
