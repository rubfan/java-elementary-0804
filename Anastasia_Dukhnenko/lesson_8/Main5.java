import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 array lenght: ");
        int length1 = scan.nextInt();
        System.out.println("2 array lenght: ");
        int length2 = scan.nextInt();
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = (int) (Math.random() * length1);
        }
        for (int x = 0; x < arr2.length; x++) {
            arr2[x] = (int) (Math.random() * length2);
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;
        for (int x = 0; x < arr1.length; x++) {
            arr3[x] = arr1[x];
            count++;
        }
        for (int x = 0; x < arr2.length; x++) {
            arr3[count++] = arr2[x];
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr1.length-1; i++) {
                if(arr1[i] > arr1[i+1]){
                    isSorted = false;
                    buf = arr1[i];
                    arr1[i] = arr1[i+1];
                    arr1[i+1] = buf;
                }
            } for (int i = 0; i < arr2.length-1; i++) {
                if(arr2[i] > arr2[i+1]){
                    isSorted = false;
                    buf = arr2[i];
                    arr2[i] = arr2[i+1];
                    arr2[i+1] = buf;
                }
            } for (int i = 0; i < arr3.length - 1; i++) {
                if (arr3[i] > arr3[i + 1]) {
                    isSorted = false;
                    buf = arr3[i];
                    arr3[i] = arr3[i + 1];
                    arr3[i + 1] = buf;
                }
            }
        }
        System.out.println("Sorted 3 array: ");
        for (int x: arr3) {
            System.out.print(x + " ");
        }
    }
}
