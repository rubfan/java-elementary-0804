import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args) {
        int[] array = new int[]{-10, 15, 45, 78, -99, 73, 1, 1998, 44, 79};
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
