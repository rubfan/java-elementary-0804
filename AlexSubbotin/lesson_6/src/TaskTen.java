import java.util.Arrays;

public class TaskTen {
    public static void main(String[] args) {
        int[] arr = new int[]{60, 45, 6, 7, 0, 2, -11, 7, 90, 43, 18, -15, -9, 51};
        int min = 0;
        for (int j = 0; j < arr.length; ++j) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    min = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = min;
                    min = 0;
                }
            }
        }
        int[] arrTwo = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            arrTwo[i] = arr[i];
        }
        System.out.println("Five first minimal numbers in array: " + Arrays.toString(arrTwo));
    }
}
