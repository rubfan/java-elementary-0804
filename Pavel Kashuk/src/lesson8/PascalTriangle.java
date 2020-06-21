package lesson8;

import java.util.Scanner;
/*
1) Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля
(элемент, который на строчке ниже, равен сумме 2х верхних элементов, которые стоят рядом;
по бокам стоят единицы)
 */

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = scanner.nextInt();
        int max = 0;
        int[][] pascal  = new int[row +1][];
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;
        for (int i = 2; i <= row; i++) {
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                String str = Integer.toString(pascal[i][j]);
                int len = str.length();
                if (len > max) {
                    max = len;
                }
            }
        }
        for (int i = 1; i <= row; i++) {
            for (int k = row; k > i; k--) {
                System.out.format("%-" + max + "s", " ");
            }
            for (int j = 1; j < pascal[i].length - 1; j++) {
                System.out.format("%-" + (max + max) + "s", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
