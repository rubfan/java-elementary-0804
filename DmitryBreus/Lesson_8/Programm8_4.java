import java.util.Scanner;

public class Programm8_4 {
    public static void main(String[] args) {
        double[] array;
        double arr;
        int size_array;
        int coutCicle = 0;
        System.out.println("Введите длинну массива");
        Scanner in = new Scanner(System.in);
        size_array = in.nextInt();
        array = new double[size_array];
        for (int d = 0; d != size_array; ) {
            array[d] = Math.random() * size_array;
            d++;
        }
        for (int i = 0; i != size_array; i++) {
            for (int j = size_array - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    arr = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = arr;
                    coutCicle++;
                }
            }
        }
        System.out.println("Количество операций: " + coutCicle);
    }

}
