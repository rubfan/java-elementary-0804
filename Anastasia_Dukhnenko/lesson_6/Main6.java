public class Main6 {
    public static void main(String[] args) {
        int[] array = {3, 5, 22, 14};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
