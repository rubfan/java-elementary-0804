import java.util.Random;
import java.util.Scanner;
public class Programm6_7 {
    static int size_array = 0;
    static int[] array;
    public static void main(String[] args) {
        System.out.println("Найти сумму всех четных и сумму всех нечетных элементов массива");
        System.out.println("Введите длинну массива");
        Scanner in = new Scanner(System.in);
        size_array = in.nextInt();
        array = new int[size_array];
        int i, Summ1 = 0, Summ2 = 0;
        Random Rnd = new Random();
        System.out.println("Знач. номер эл.");
        for (i = 0; i <= size_array - 1; i++) {
            array[i] = Rnd.nextInt(size_array + i + 5);
            System.out.println(array[i] + "      " + i);
            if (array[i] % 2 == 0 && array[i] != 0) {
                Summ1 = Summ1 + array[i];
            }
            if (array[i] % 2 == 1 && array[i] != 0) {
                Summ2 = Summ2 + array[i];
            }
        }//for ( i=0; i<=size_array-1; i++)
        System.out.println("Четн.  Нечетн.");
        System.out.println(Summ1 + "       " + Summ2);
    }
}
