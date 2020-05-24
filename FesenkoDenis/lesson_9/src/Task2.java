import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String input = "internationalization localization cat elephant monitor";

        creatingArray(input);
    }

    public static void creatingArray(String line) {
        String[] arr = line.split(" ");
        for (String var :
                arr) {
            if (var.length() < 4) {
                System.out.print(" " + var);
            } else if (var.length() > 4) {
                String varForReplace = String.valueOf(var.length() - 2);
                String varThatReplace = var.substring(1, var.length() - 1);
                System.out.print(" " + var.replaceAll(varThatReplace, varForReplace));
            }
        }
    }
}
