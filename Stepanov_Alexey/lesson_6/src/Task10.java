public class Task10 {
    public static void main(String[] args) {
        int[] array = {87, 20, 50, 82, 57, 67, 77, 84, 18, 36, 38, 94, 64, 49, 74, 54, 7, 45, 25, 72};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Minimum element #" + (i + 1) + ": " + array[i]);
        }
    }
}
