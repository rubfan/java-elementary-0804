import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        double[] array1 = new double[size];
        double[] array2 = new double[size + 5];
        double[] array3 = new double[size + 10];
        fillInArray(array1);
        fillInArray(array2);
        fillInArray(array3);
        sortArray(array1, true);
        sortArray(array2, true);
        sortArray(array3, true);
    }

    public static double[] fillInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }

    public static double[] sortArray(double[] array, boolean printIterationsCount) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    double temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    counter++;
                }
            }
        }
        if (printIterationsCount) {
            System.out.println("Iterations to sort " + array.length + " elements array: " + counter);
        }
        return array;
    }
}
