import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[3];

        random(arr1);
        bubble(arr1);
        System.out.println("Array 1: " + Arrays.toString(arr1));
        random(arr2);
        bubble(arr2);
        System.out.println("Array 2: " + Arrays.toString(arr2));

        int[] arrNew = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arrNew[count++] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arrNew[count++] = arr2[j];
        }
        System.out.println("New array before sort " + Arrays.toString(arrNew));
        bubble(arrNew);
        System.out.println("Array after sort" + Arrays.toString(arrNew));
    }

    public static void random(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 20);
    }

    public static void bubble(int[] array) {
        int j;
        boolean n = true;
        int temp;

        while (n) {
            n = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    n = true;
                }
            }
        }
    }
}
