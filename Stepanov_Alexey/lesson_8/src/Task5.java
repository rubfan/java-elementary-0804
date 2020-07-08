import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int arrayOneSize = 8;
        int arrayTwoSize = 4;
        double[] arrayOne = new double[arrayOneSize];
        double[] arrayTwo = new double[arrayTwoSize];
        Task4.fillInArray(arrayOne);
        Task4.fillInArray(arrayTwo);
        Task4.sortArray(arrayOne, false);
        Task4.sortArray(arrayTwo, false);

        double[] arrayMerge = new double[arrayOne.length + arrayTwo.length];
        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;
        int arrayMergeIndex = 0;
        while (arrayOneIndex < arrayOneSize && arrayTwoIndex < arrayTwoSize) {
            if (arrayOne[arrayOneIndex] < arrayTwo[arrayTwoIndex]) {
                arrayMerge[arrayMergeIndex] = arrayOne[arrayOneIndex];
                arrayMergeIndex++;
                arrayOneIndex++;
            } else {
                arrayMerge[arrayMergeIndex] = arrayTwo[arrayTwoIndex];
                arrayMergeIndex++;
                arrayTwoIndex++;
            }
        }
        while (arrayOneIndex < arrayOneSize) {
            arrayMerge[arrayMergeIndex] = arrayOne[arrayOneIndex];
            arrayMergeIndex++;
            arrayOneIndex++;
        }
        while (arrayTwoIndex < arrayTwoSize) {
            arrayMerge[arrayMergeIndex] = arrayTwo[arrayTwoIndex];
            arrayMergeIndex++;
            arrayTwoIndex++;
        }
        System.out.println("The first sorted array: " + Arrays.toString(arrayOne));
        System.out.println("The second sorted array: " + Arrays.toString(arrayTwo));
        System.out.println("Merge result: " + Arrays.toString(arrayMerge));
    }
}
