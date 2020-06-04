import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(findMinBySort(array, true));
        int[] array1 = generateArray(20);
        System.out.println(Arrays.toString(array1));
        System.out.println(findMinBySort(array1, true));
        int[] array2 = generateArray(40);
        System.out.println(Arrays.toString(array2));
        System.out.println(findMinBySort(array2, true));
    }

    public static int findMinBySort(int[] array, boolean showIterations) {
        int iterations = 0;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                iterations++;
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        if (showIterations) {
            System.out.println("Iterations number: " + iterations);
        }
        return array[0];
    }

    private static int[] generateArray(int itemsNumber) {
        int[] array = new int[itemsNumber];
        for (int i = 0; i < itemsNumber; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}