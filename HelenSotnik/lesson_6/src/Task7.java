import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 78, 16, 7, -2, 15, 9, 43, 37, 12, 85, 11, 5, 1, -143, 20};
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

