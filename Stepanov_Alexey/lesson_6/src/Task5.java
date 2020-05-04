import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {7, 11, 50, 18, 70, 17, 26, 43, 89, 17, 36, 81, 74, 67, 15, 13, 86, 49, 8, 25};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items to sum (not greater than 20): ");
        int elementsToSum = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < elementsToSum; i++) {
            result += array[i];
        }
        System.out.println(result);
    }
}
