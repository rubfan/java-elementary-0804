import java.util.Scanner;

public class Programm8_2 {
    static int n, m, digit, movesky, moveroad;
    static int[][] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество срок");
        n = in.nextInt();
        System.out.println("Введите количество столбцов");
        m = in.nextInt();
        array = new int[m][n];
        digit = 1;
        movingonperimetr();
        movesky = 1;
        moveroad = 1;
        while (digit < m * n) {
            movingtoRight();
            movingtoDown();
            movingtoLeft();
            movingtoUp();
            insertLastDigit();
        }
        outPutarray();
    }

    static void outPutarray() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y] + "  ");

                } else {
                    System.out.print(array[x][y] + " ");
                }
            }
            System.out.println("");
        }

    }

    static void movingonperimetr() {
        for (int y = 0; y < n; y++) {
            array[0][y] = digit;
            digit++;
        }
        for (int x = 1; x < m; x++) {
            array[x][n - 1] = digit;
            digit++;
        }
        for (int y = n - 2; y >= 0; y--) {
            array[m - 1][y] = digit;
            digit++;
        }
        for (int x = m - 2; x > 0; x--) {
            array[x][0] = digit;
            digit++;
        }
    }

    static void movingtoRight() {
        while (array[movesky][moveroad + 1] == 0) {
            array[movesky][moveroad] = digit;
            digit++;
            moveroad++;
        }

    }

    static void movingtoLeft() {
        while (array[movesky][moveroad - 1] == 0) {
            array[movesky][moveroad] = digit;
            digit++;
            moveroad--;
        }
    }

    static void movingtoUp() {
        while (array[movesky - 1][moveroad] == 0) {
            array[movesky][moveroad] = digit;
            digit++;
            movesky--;
        }

    }

    static void movingtoDown() {
        while (array[movesky + 1][moveroad] == 0) {
            array[movesky][moveroad] = digit;
            digit++;
            movesky++;
        }

    }

    static void insertLastDigit() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = digit;
                }
            }

        }

    }
}
