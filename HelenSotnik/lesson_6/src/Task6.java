import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{6, -4, 78, -1865, 0, 16, 7, 41, 2, 15, -999, 43, 37, 12, 85, 11, 5, 1211, -143, 20};
        System.out.println("Array: " + Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Array max value: " + max);
        System.out.println("Array min value: " + min);
    }
}
