import java.util.Scanner;

public class HomeWork_8_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int l = scan.nextInt();
        System.out.println("Enter number of columns ");
        int c = scan.nextInt();
        int[][] array = new int[l][c];
        int s = 1;
        for (int y = 0; y < c; y++) {
            array[0][y] = s;
            s++;
        }
        for (int x = 1; x < l; x++) {
            array[x][c - 1] = s;
            s++;
        }
        for (int y = c - 2; y >= 0; y--) {
            array[l - 1][y] = s;
            s++;
        }
        for (int x = l - 2; x > 0; x--) {
            array[x][0] = s;
            s++;
        }
        int a = 1;
        int b = 1;
        while (array[a][b + 1] == 0) {
            array[a][b] = s;
            s++;
            b++;
        }
        while (array[a + 1][b] == 0) {
            array[a][b] = s;
            s++;
            a++;
        }
        while (array[a][b - 1] == 0) {
            array[a][b] = s;
            s++;
            b--;
        }
        while (array[a - 1][b] == 0) {
            array[a][b] = s;
            s++;
            a--;
        }
        for (int x = 0; x < l; x++) {
            for (int y = 0; y < c; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                    s++;
                }
            }
        }
        for (int x = 0; x < l; x++) {
            for (int y = 0; y < c; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y] + "  ");
                } else {
                    System.out.print(array[x][y] + " ");
                }
            }
            System.out.println("");
        }
    }
}