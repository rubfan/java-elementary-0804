public class Main2 {
    public static void main(String[] args) {
        Spiral(5,5);
    }
    public static void Spiral(int a, int b) {
        int k = 1;
        int[][] array = new int[a][b];
        for (int y = 0; y < b; y++) {
            array[0][y] = k;
            k++;
        }
        for (int x = 1; x < a; x++) {
            array[x][b - 1] = k;
            k++;
        }
        for (int y = b - 2; y >= 0; y--) {
            array[a - 1][y] = k;
            k++;
        }
        for (int x = a - 2; x > 0; x--) {
            array[x][0] = k;
            k++;
        }
        int c = 1;
        int d = 1;
        while (k < a * b) {
            while (array[c][d + 1] == 0) {
                array[c][d] = k;
                k++;
                d++;
            }
            while (array[c + 1][d] == 0) {
                array[c][d] = k;
                k++;
                c++;
            }
            while (array[c][d - 1] == 0) {
                array[c][d] = k;
                k++;
                d--;
            }
            while (array[c - 1][d] == 0) {
                array[c][d] = k;
                k++;
                c--;
            }
        }
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = k;
                }
            }
        }
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
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
