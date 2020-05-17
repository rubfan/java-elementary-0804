import javax.swing.*;
import java.util.Scanner;

public class HomeWork_9 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
//        Task 1 Напишите программу, которая заменяет символы в почтовом адресе пользователя:
        System.out.println("Please enter e-mail address");
        String s = sr.nextLine();
        changeСharacter(s);

//        Task 2 Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.
        System.out.println("Please enter text");
        String in = sr.nextLine();
        shortenTheWords(in);

//        Task 3 Создайте несколько классов геометрических фигур с инстанс методами:
//
//        - getArea (расчет площади)
//
//        - getPerimeter (расчет периметра)

//        Task 4 Занесите все фигуры в массив и пощитайте в нем сумму площадей и периметров для всех фигур
//
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(6, 8, 10);
        shapes[1] = new Rectangle(8, 12);
        shapes[2] = new Circle(7);
        float sumArea = 0;
        float sumPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumArea += shapes[i].getArea();
            sumPerimeter += shapes[i].getPerimeter();
        }
        System.out.println();
        System.out.println("Area all shapes = " + sumArea);
        System.out.println("Perimeter all shapes = " + sumPerimeter);
    }

    public static String changeСharacter(String origin) {
        String newString = origin.replace("@", "[ at ]");
        newString = newString.replace(".", "[ dot ]");
        System.out.println(newString);
        return newString;
    }

    public static String shortenTheWords(String text) {
        String[] words = text.split(" ");
        String[] wordsReplace = new String[words.length];
        String newWords = " ";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 4) {
                wordsReplace[i] = words[i];
            } else {
                char a = words[i].charAt(0);
                char z = words[i].charAt(words[i].length() - 1);
                int number = words[i].length();
                wordsReplace[i] = String.valueOf(a) + String.valueOf(number) + String.valueOf(z);
                newWords += wordsReplace[i];
            }
            System.out.print(wordsReplace[i] + " ");
        }
        return newWords;
    }
}