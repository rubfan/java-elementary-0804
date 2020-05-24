import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 20);
        }
        System.out.println("Random array: " + Arrays.toString(array));
        bubbleSort(array);
    }

    public static void bubbleSort(double[] arr) {
        boolean n = true;
        double temp;
        int j;
        int a = arr.length;
        int quantity = (a - 1) * (a / 2);
        while (n) {
            n = false;
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    n = true;
                }
            }
        }
        System.out.println("Array after Bubble sort: " + Arrays.toString(arr));
        System.out.println("Quantity of cycle iterations: " + quantity);
    }
}
