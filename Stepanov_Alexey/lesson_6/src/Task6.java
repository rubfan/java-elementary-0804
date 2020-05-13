public class Task6 {
    public static void main(String[] args) {
        int[] array = {32, 41, 33, 69, 55, 35, 62, 27, 62, 11, 31, 32, 53, 11, 87, 10, 25, 85, 43, 13};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
