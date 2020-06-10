import java.util.Scanner;

public class HomeworkLesson_9 {
    public static void main(String[] args) {
        /*1) Напишите программу, которая заменяет символы в почтовом адресе пользователя:
        @ заменяется на [ at ]
        . заменяется на [ dot ]
        Пример ввода:
        person@gmail.com
        Результат:
        person[ at ]gmail[ dot ].com*/

        System.out.println("Please, enter email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        charChanger(email);

        /*2)  i18n используется для обозначения слова internationalization, где 18 означает количество
        букв между первой и последней в этом слове, такое можно встретить в среде разработчиков.
        Например, для слова localization используется сокращение l10n.
        Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму.
        Слова длиной меньше 4х оставить без изменений.
        Пример ввода:
        internationalization localization cat elephant monitor
        Результат:
        i18n l10n cat e6t m5r
        PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который поместит
        слова в массив и для каждого из них вызовет вашу функцию*/

        String enteredWords = "internationalization localization cat elephant monitor";
        String[] wordsArray = enteredWords.split(" ");
        for (String fullWord : wordsArray) {
            if (fullWord.length() >= 4) {
                String resultWord = wordChanger(fullWord);
                System.out.println(fullWord + " : " + resultWord);
            } else {
                System.out.println(fullWord);
            }
        }

        /*3) Создайте несколько классов геометрических фигур с инстанс методами:
        - getArea (расчет площади)
        - getPerimeter (расчет периметра)*/

        Circle firstCircle = new Circle();
        firstCircle.setRadius(10);

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setFirstSide(10);
        firstRectangle.setSecondSide(20);

        Trapeze firstTrapeze = new Trapeze();
        firstTrapeze.setBottomBase(10);
        firstTrapeze.setUpperBase(4);
        firstTrapeze.setFirstSide(5);
        firstTrapeze.setSecondSide(5);
        firstTrapeze.setHeight(4);

//      4) Занесите все фигуры в массив и пощитайте в нем сумму площадей и периметров для всех фигур

        Figures[] figures = new Figures[3];
        figures[0] = firstCircle;
        figures[1] = firstRectangle;
        figures[2] = firstTrapeze;

        double sumAllPerimeters = 0;
        double sumAllAreas = 0;

        for (int i = 0; i < figures.length; i++) {
            sumAllAreas += figures[i].getArea();
            sumAllPerimeters += figures[i].getPerimeter();
        }
        System.out.println("Sum of all areas: " + sumAllAreas);
        System.out.println("Sum of all perimeters: " + sumAllPerimeters);
    }

    private static String wordChanger(String fullWord) {
        StringBuilder stringBuilder = new StringBuilder(fullWord);
        String middleCharLength = String.valueOf(stringBuilder.length() - 2);
        String resultWord = String.valueOf(stringBuilder.replace(1, stringBuilder.length() - 1, middleCharLength));
        return resultWord;
    }

    private static void charChanger(String email) {
        email = email
                .replace("@", "[ at ]")
                .replace(".", "[ dot ]");
        System.out.println(email);
    }
}