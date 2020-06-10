import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        int[][] array = new int[height][width];
        int boundUp = 0;
        int boundDown = height - 1;
        int boundLeft = 0;
        int boundRight = width - 1;
        int size = height * width;
        int numberToFill = 1;

        while (numberToFill <= size) {
            //fill in upper row
            for (int i = boundLeft; i <= boundRight; i++) {
                if (numberToFill <= size) {
                    array[boundUp][i] = numberToFill;
                    numberToFill++;
                }
            }
            boundUp++;
            //fill in right column
            for (int i = boundUp; i <= boundDown; i++) {
                if (numberToFill <= size) {
                    array[i][boundRight] = numberToFill;
                    numberToFill++;
                }
            }
            boundRight--;
            //fill in bottom row
            for (int i = boundRight; i >= boundLeft; i--) {
                if (numberToFill <= size) {
                    array[boundDown][i] = numberToFill;
                    numberToFill++;
                }
            }
            boundDown--;
            //fill in left column
            for (int i = boundDown; i >= boundUp; i--) {
                if (numberToFill <= size) {
                    array[i][boundLeft] = numberToFill;
                    numberToFill++;
                }
            }
            boundLeft++;
        }
        System.out.println("Result:");
        for (int i = 0; i < height; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
