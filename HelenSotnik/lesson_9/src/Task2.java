import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words with space");
        String words = sc.nextLine();
        System.out.println("Modified words: ");

        String[] text = words.split(" ");
        String w = "";
        for (int i = 0; i < text.length; i++) {
            w = text[i];
            if (w.length() > 4) {
                String substring = w.substring(1, w.length() - 1);
                String numLettersInside = String.valueOf(w.length() - 2);
                String modifiedWord = w.replaceAll(substring, numLettersInside);
                System.out.print(modifiedWord + " ");
            } else {
                System.out.print(w + " ");
            }
        }
    }
}
