import java.util.Random;
import java.util.Scanner;

public class Programm11_3 {
    static int[] array;

    public static void main(String[] args) {
        int sum;
        createarray();
        System.out.print("Введите сумму sum=");
        Scanner in = new Scanner(System.in);
        sum = in.nextInt();
        lookingSumm(array, sum);

    }

    public static void createarray() {
        int i = 0;
        array = new int[5];
        Random rn = new Random();
        array[0] = rn.nextInt(5) + 1;
        System.out.print("a={" + array[0]);
        while (i != 4) {
            i++;
            array[i] = array[i - 1] + rn.nextInt(5) + 1;
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }

    public static void lookingSumm(int[] array, int Summ) {
        int a = 0, b = 0;
        boolean rslt = false;
        for (int i = 0; i != 5; i++) {
            a = array[i];
            for (int j = i + 1; j != 5; j++) {
                b = array[j];
                if (a + b == Summ) {
                    rslt = true;
                    break;
                }
            }
            if (rslt == true) break;
        }
        if (rslt == true) {
            System.out.println("Результат: " + rslt + ", т.к. сумма " +
                    a + " и " + b + " равны " + Summ);
        } else {
            System.out.println("Результат: " + rslt + ", т.к. сумма " +
                    "2-х элементов не равна " + Summ);
        }
    }
}
