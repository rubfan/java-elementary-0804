package lesson8;

import java.util.Scanner;
/*
3) Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
Определить количество таких слов в тексте, в котором все слова введены через запятую.
Пример ввода:
deleveled, evitative, cat, dog, deified
Результат:
There are 3 palindromes in the text
 */

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("For check a palindrome, enter words separated ',':");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String checkWords = scanner.nextLine();
        String[] arrWords = checkWords.split(",");
        for (int i = 0; i < arrWords.length; i++) {
            arrWords[i] = arrWords[i].trim();
            if (palindrome(arrWords[i])) {
                System.out.printf("%s - palindrome\n",arrWords[i]);
                count++;
            }
        }
        System.out.println("There are " + count + " palindromes checkWords the text");
    }

    public static boolean palindrome(String words) {
        if (words.length() == 1) {
            return true;
        }
        for (int i = 0; i <= words.length() >> 1; i++) {
            if (words.toLowerCase().charAt(i)
                    != words.toLowerCase().charAt(words.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
