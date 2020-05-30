package Lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1) Напишите программу, которая заменяет символы в почтовом адресе пользователя:
        @ заменяется на [ at ]
        . заменяется на [ dot ]
        Пример ввода:
        person@gmail.com
        Результат:
        person[ at ]gmail[ dot ].com
        */

        mail();

        /*
        2)  i18n используется для обозначения слова internationalization,
        где 18 означает количество букв между первой и последней в этом слове,
        такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
        Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму.
        Слова длиной меньше 4х оставить без изменений.
        Пример ввода:
        internationalization localization cat elephant monitor
        Результат:
        i18n l10n cat e6t m5r
        PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит,
        который поместит слова в массив и для каждого из них вызовет вашу функцию
        */

        cutWord();

        /*
        4) Занесите все фигуры в массив и пощитайте в нем сумму площадей и периметров для всех фигур
        */

        calculateFigures();
    }

    public static void mail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email:");

        String email = scanner.next();

        System.out.println(email.replace
                ("@", "[ at ]").replace(".", "[ dot ]"));
    }

    public static void cutWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");

        String words = scanner.nextLine();
        String[] wordsArr = words.split(" ");
        StringBuilder out = new StringBuilder();

        for (String s : wordsArr) {
            out.append(cut(s)).append(" ");
        }
        System.out.println(out.toString().trim());
    }

    public static String cut(String s) {
        if (s.length() < 4) {
            return s;
        }
        return s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1);
    }

    public static void calculateFigures() {
        Figure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10)};

        double sumPerimeters = 0;
        double sumAreas = 0;

        for (Figure fig : figure) {
            System.out.println(fig.getPerimeter());
            System.out.println(fig.getArea());

            sumPerimeters += fig.getPerimeter();
            sumAreas += fig.getArea();
        }
        System.out.println("Total perim is: " + sumPerimeters +
                "\nTotal area is: " + sumAreas);
    }
}
