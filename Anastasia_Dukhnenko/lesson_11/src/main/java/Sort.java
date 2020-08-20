public class Sort {
    public static void sortArray(Integer[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                    count++;
                }
            }
            int x = array[i];
            array[i] = minValue;
            array[minIndex] = x;
        }
        System.out.println(count);
    }
}
