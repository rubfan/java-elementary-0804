import java.util.Random;
import java.util.Scanner;

public class Programm6_5 {
    static int size_array = 0;
    static int[] array;
    public static void main(String[] args) {
        System.out.println("Программа подсчета суммы первых n элементов массива");
        System.out.println("Введите длинну массива");
        Scanner in = new Scanner(System.in);
        size_array = in.nextInt();
        array = new int[size_array];
        int i, Summ = 0;
        Random Rnd = new Random();
        System.out.println("Знач. номер эл.");
        for (i = 0; i <= size_array - 1; i++) {
            array[i] = Rnd.nextInt(size_array);
            System.out.println(array[i] + "      " + i);
        }
        System.out.println("Введите количество первых элементов");
        int n = in.nextInt();
        i = -1;
        while (i != n - 1) {
            i++;
            Summ = Summ + array[i];
        }
        System.out.println("Сумма " + n + "-их первых элементов равна " + Summ);
    }
}
