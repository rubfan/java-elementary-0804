package lesson8;

import java.util.Scanner;
/*
2) Заполните 2-мерный массив по спирали, размер масива по высоте и ширине вводится с клавиатуры:
1 2 3 4
12 13 14 5
11 16 15 6
10 9 8 7
 */

public class SpiralArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        int value = 1;
        int firstRow = 0;
        int firstCol = 0;
        int LastRow = rows - 1;
        int LastCol = columns - 1;
        while(value <= rows * columns) {
            for(int i = firstCol; i <= LastCol; i++) {
                arr[firstRow][i] = value++;
            }
            for(int i = firstRow + 1; i <= LastRow; i++) {
                arr[i][LastCol] = value++;
            }
            for(int i = LastCol - 1; i >= firstCol; i--) {
                arr[LastRow][i] = value++;
            }
            for(int i = LastRow - 1; i >= firstRow + 1; i--) {
                arr[i][firstCol] = value++;
            }
            firstCol++;
            LastCol--;
            firstRow++;
            LastRow--;
        }
        System.out.println("Generated Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(String.format("%5s", arr[i][j]));
            }
            System.out.println();
        }
    }
}
