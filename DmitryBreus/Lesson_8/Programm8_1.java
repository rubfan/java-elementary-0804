public class Programm8_1 {
    public static void main(String[] args) {
        int n = 10;
        int[][] S = new int[n][n];
        for (int i = 1; i !=n; i++) {
            S[i][0] = 1;
            for (int j = 1; j!=n; j++) {
                S[i][j] = S[i - 1][j - 1] + S[i - 1][j];
            }
        }
        String[][] array = new String[n][n];
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != S[i].length; j++) {
                if (S[i][j] == 0) array[i][j] = "  ";
                else array[i][j] = S[i][j] + " ";
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
