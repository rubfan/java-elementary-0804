import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of strings in 2dim array");
        int a = scanner.nextInt();
        System.out.println("Enter number of columns in 2dim array");
        int b = scanner.nextInt();
        snakeFillingArray(a, b);
    }

    private static void snakeFillingArray(int n1, int n2) {
        int[][] arr = new int[n1][n2];
        int number = 1;
        int a = 1;
        int b = 1;
        for (int j = 0; j < n2; j++) {
            arr[0][j] = number;
            number++;
        }
        for (int i = 1; i < n1; i++) {
            arr[i][n2 - 1] = number;
            number++;
        }
        for (int j = n2 - 2; j >= 0; j--) {
            arr[n1 - 1][j] = number;
            number++;
        }
        for (int i = n1 - 2; i > 0; i--) {
            arr[i][0] = number;
            number++;
        }
        while (number < n1 * n2) {
            while (arr[a][b + 1] == 0) {
                arr[a][b] = number;
                number++;
                b++;
            }
            while (arr[a + 1][b] == 0) {
                arr[a][b] = number;
                number++;
                a++;
            }
            while (arr[a][b - 1] == 0) {
                arr[a][b] = number;
                number++;
                b--;
            }
            while (arr[a - 1][b] == 0) {
                arr[a][b] = number;
                number++;
                a--;
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = number;
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
