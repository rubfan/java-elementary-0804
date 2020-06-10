import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pascal triangle height: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        array[0][0] = 1;
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                array[i][0] = 1;
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}