import java.util.Arrays;

public class TaskSeven {
    public static void main(String[] args) {
        int[] array = new int[]{-10, 15, 45, 78, -99, 73, 1, 1998, 44, 79};
        System.out.println("Array: " + Arrays.toString(array));
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        System.out.println("Sum of all even numbers in array: " + sumEven);
        System.out.println("Sum of all odd numbers in array: " + sumOdd);
    }
}
