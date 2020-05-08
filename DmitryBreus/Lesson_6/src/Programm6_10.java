import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Programm6_10 {
    public static void main(String[] args) {
        int size_array = 0;
        int[] array;
        int i;
        System.out.println("Программа вывод первы-х 5 минимальных элементов n-го массива");
        System.out.println("Введите длинну массива");
        Scanner in = new Scanner(System.in);
        size_array = in.nextInt();
        array = new int[size_array];
        Random Rnd = new Random();
        System.out.println("Знач. номер эл.");
        for (i = 0; i <= size_array - 1; i++) {
            array[i] = Rnd.nextInt(size_array + 5 - i);
            System.out.println(array[i] + "      " + i);
        }
        System.out.println("Первые 5 мин элементов:");
        i = 0;
        Arrays.sort(array);
        while (i <= 4) {
            System.out.print(array[i] + " ");
            i++;
        }
    }
}
