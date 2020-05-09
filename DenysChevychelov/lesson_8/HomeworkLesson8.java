import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson8 {
    public static void main(String[] args) {
        /*1) Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля (элемент, который
        на строчке ниже, равен сумме 2х верхних элементов, которые стоят рядом; по бокам стоят единицы),
        изображение на картинке:*/

        System.out.println("HOW MANY ROWS OF PASCAL`S TRIANGLE?");
        Scanner scanner = new Scanner(System.in);
        int rowsNumber = scanner.nextInt();
        int[][] pascalTriangle = new int[rowsNumber][rowsNumber];
        pascalTriangle(pascalTriangle, rowsNumber);

        /*2) Заполните 2-мерный массив по спирали, размер масива по высоте и ширине вводится с клавиатуры:
        1 2 3 4
        12 13 14 5
        11 16 15 6
        10 9 8 7*/

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scann.nextInt();
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();

        arraysSpiralFill(rows, columns);

        /*3) Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
        Определить количество таких слов в тексте, в котором все слова введены через запятую.
        Пример ввода:
        deleveled, evitative, cat, dog, deified
        Результат:
        There are 3 palindromes in the text*/

        System.out.println("To check for a palindrome, enter words separated by ',': ");
        Scanner wordsScan = new Scanner(System.in);
        String words = wordsScan.nextLine();

        palindromeChecker(words);

        /*4) Сделайте сортировку масива по возрастанию самостоятельно без использования готовых методов библиотек
        (можете взять алгоритм пузырьком), и посчитайте сколько на нее отводится циклов с повторяющимся кодом.
        Масив можно заполнять случайными double элементами с использованием (Math.random() * N) выражения.
        Попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится число
        повторяющихся операций в цикле.*/

        System.out.println("Sorted array: " + Arrays.toString(arraySorter()));

        /*5) Есть 2 полученых с помошью метода из 4го задания массива упорядоченных по возрастанию.
        Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.
        Пример ввода:
        a = {1, 3, 5}
        b = {2, 4, 8, 9, 12}
        Результат:
        c = {1, 2, 3, 4, 5, 8, 9, 12}*/

        int[] firstArray = arraySorter();
        int[] secondArray = arraySorter();
        arraysMerger(firstArray, secondArray);
    }

    public static void pascalTriangle(int[][] pascalTriangle, int rowsNumber) {
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row)
                    pascalTriangle[row][column] = 1;
                else
                    pascalTriangle[row][column] = pascalTriangle[row - 1][column - 1]
                            + pascalTriangle[row - 1][column];
            }
            System.out.println(Arrays.toString(pascalTriangle[row]).replace(",", "\t"));
        }
    }

    static void arraysSpiralFill(int rows, int columns) {
        int value = 1;
        int[][] array = new int[rows][columns];
        int startRowIndex = 0;
        int endColumnIndex = rows;
        int startColumnIndex = 0;
        int endRowIndex = columns;

        while (startRowIndex < endColumnIndex && startColumnIndex < endRowIndex) {
            for (int i = startColumnIndex; i < endRowIndex; ++i) {
                array[startRowIndex][i] = value++;
            }
            startRowIndex++;
            for (int i = startRowIndex; i < endColumnIndex; ++i) {
                array[i][endRowIndex - 1] = value++;
            }
            endRowIndex--;
            if (startRowIndex < endColumnIndex) {
                for (int i = endRowIndex - 1; i >= startColumnIndex; --i) {
                    array[endColumnIndex - 1][i] = value++;
                }
                endColumnIndex--;
            }
            if (startColumnIndex < endRowIndex) {
                for (int i = endColumnIndex - 1; i >= startRowIndex; --i) {
                    array[i][startColumnIndex] = value++;
                }
                startColumnIndex++;
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]).replace(",", "\t"));
        }
    }

    public static void palindromeChecker(String words) {
        String[] arrayWords = words.split(", ");
        System.out.println(Arrays.toString(arrayWords));
        boolean palindrome;
        int counter = 0;
        for (String word : arrayWords) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(word).reverse();
            palindrome = word.equalsIgnoreCase(String.valueOf(stringBuilder));
            if (palindrome) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " palindromes in the text.");
    }

    public static int[] arraySorter() {
        System.out.println("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        System.out.println("Enter number generations lower limit: ");
        int lowerLimit = scan.nextInt();
        System.out.println("Enter number generations upper limit: ");
        int upperLimit = scan.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        }
        System.out.println("Unsorted arrey: " + Arrays.toString(array));
        boolean sorted = false;
        int counter = 0;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }
            }
        }
        System.out.println("The number of cycles: " + counter);
        return array;
    }

    public static void arraysMerger(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int firstArrIndex = 0;
        int secondArrIndex = 0;

        for (int i = 0; i < resultArray.length; i++) {
            if (firstArrIndex == firstArray.length) {
                resultArray[i] = secondArray[secondArrIndex];
                secondArrIndex++;
            } else if (secondArrIndex == secondArray.length) {
                resultArray[i] = firstArray[firstArrIndex];
                firstArrIndex++;
            } else if (firstArray[firstArrIndex] < secondArray[secondArrIndex]) {
                resultArray[i] = firstArray[firstArrIndex];
                firstArrIndex++;
            } else {
                resultArray[i] = secondArray[secondArrIndex];
                secondArrIndex++;
            }
        }
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Merged array: " + Arrays.toString(resultArray));
    }
}