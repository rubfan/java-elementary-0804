import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{60, 45, 6, 7, 0, 2, -11, 7, 90, 43, 18, -15, -9, 51};
        int min = 0;
        for (int j = 0; j < array.length; ++j) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    min = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                    min = 0;
                }
            }
        }
        int[] array2 = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            array2[i] = array[i];
        }
        System.out.println("Five first minimal numbers in array: " + Arrays.toString(array2));
    }
}
