import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        String in = scanner.nextLine();
        String result = " = ";

        String[] words = in.split(",");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
            if (palindrome(words[i])) {
                quantity++;
                result += words[i] + ", ";
            }
        }

        result = result.substring(0, result.length() - 2);
        result += ".";
        System.out.println("There are " + quantity + " palindromes in the text, namely" + result);
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i <= s.length() >> 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

}

