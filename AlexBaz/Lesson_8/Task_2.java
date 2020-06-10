import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Please enter the length of the \"column\" of the array");
        int y = src.nextInt();
        System.out.println("Please enter the length of the \"line\" of the array");
        int x = src.nextInt();
        int[][] arr = new int[y][x];
        int number = 1;
        int variable = 0;
        for (int k = 0; k < (x + y) / 2; k++) {
            for (int i = variable; i < x - variable && arr[variable][i] == 0; i++) {
                arr[variable][i] = number;
                number++;
            }
            for (int i = 1 + variable; i < y - variable && arr[i][x - (1 + variable)] == 0; i++) {
                arr[i][x - (1 + variable)] = number;
                number++;
            }
            for (int i = x - (2 + variable); i >= variable && arr[y - (1 + variable)][i] == 0; i--) {
                arr[y - (1 + variable)][i] = number;
                number++;
            }
            for (int i = y - (2 + variable); i >= 1 + variable && arr[i][variable] == 0; i--) {
                arr[i][variable] = number;
                number++;
            }
            variable++;
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}