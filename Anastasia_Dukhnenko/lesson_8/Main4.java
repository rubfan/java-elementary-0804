import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Array length: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] arr = new double[length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Math.random() * length;
        }
        int count = 0;
        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    count++;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Amount of operations: " + count);
    }
}
