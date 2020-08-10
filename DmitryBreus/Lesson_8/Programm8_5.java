import java.util.Arrays;
import java.util.Scanner;

public class Programm8_5 {
    public static double[] arrayOut;
    public static double[] arraySort1, arraySort2;

    public static void main(String[] args) {
        double[] array1, array2, result;
        double arr;
        int size_array1, size_array2;
        int coutCicle = 0;
        String Out1 = "";
        String Out2 = "";
        System.out.println("Введите 1-го длинну массива");
        Scanner in = new Scanner(System.in);
        size_array1 = in.nextInt();
        array1 = new double[size_array1];
        for (int d = 0; d != size_array1; ) {
            array1[d] = Math.random() * size_array1;
            Out1 = Out1 + array1[d] + ", ";
            d++;
        }
        Out1=Out1.substring(0,Out1.length()-2);
        System.out.println(Out1);
        SortMethod(array1);
        arraySort1 = arrayOut;
        System.out.println();
        System.out.println("Введите 2-го длинну массива");
        size_array2 = in.nextInt();
        array2 = new double[size_array2];
        for (int d = 0; d != size_array2; ) {
            array2[d] = Math.random() * size_array2;
            Out2 = Out2 + array2[d] + ", ";
            d++;
        }
        Out2=Out2.substring(0,Out2.length()-2);
        System.out.println(Out2);
        SortMethod(array2);
        arraySort2 = arrayOut;
        result = Arrays.copyOf(arraySort1, arraySort1.length + arraySort2.length);
        System.arraycopy(arraySort2, 0, result, arraySort1.length, arraySort2.length);
        System.out.println();
        System.out.println("Результат объеденения 2-х массивов в 3-й созданный массив с сортировкой по возрастанию");
        SortMethod(result);
        arrayOut = result;
        String resultOut = "";
        for (int d = 0; d != result.length; ) {

            resultOut = resultOut + result[d] + ", ";
            d++;
        }
        resultOut =resultOut.substring(0,resultOut.length()-2);
        System.out.println(resultOut);
    }

    public static void SortMethod(double[] inarray) {
        double arr = 0;
        for (int i = 0; i != inarray.length; i++) {
            for (int j = inarray.length - 1; j > i; j--) {
                if (inarray[j - 1] > inarray[j]) {
                    arr = inarray[j - 1];
                    inarray[j - 1] = inarray[j];
                    inarray[j] = arr;
                }
            }
        }
        arrayOut = inarray;
    }
}
