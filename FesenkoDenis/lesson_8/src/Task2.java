import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] charStr = new int[a][b];
        int aF = 0;
        int bF = 0;
        int ch = 0;
        for (int minus = 1; minus < (charStr.length); minus++) {
            for (int i = 0; i < a - minus; i++) { //fills the top line from left to right
                charStr[aF][bF] = ch;
                if (i < a - minus) {
                    bF++;
                }
                ch++;
            }
            for (int i = 0; i < b - minus; i++) { //fills the right column from down to up
                charStr[aF][bF] = ch;
                if (i < a - minus) {
                    aF++;
                }
                ch++;
            }
            for (int i = 0; i < a - minus; i++) { //fill the bottom line from right to left
                charStr[aF][bF] = ch;
                if (i < a - minus) {
                    bF--;
                }
                ch++;
            }
            for (int i = 0; i < a - minus; i++) { //fill the left column from down to up
                charStr[aF][bF] = ch;
                if (i < a - minus) {
                    aF--;
                }
                ch++;
            }
            aF++;
            bF++;
            minus++;
            if (a % 2 != 0) {
                charStr[(int) (charStr.length / 2 + 0.5)][(int) (charStr.length / 2 + 0.5)] = ch;
                // inputing the last charecter
            }
        }
        showArray(charStr);
    }

    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
