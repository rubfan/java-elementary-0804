public class Main1 {
    public static void main(String[] args) {
        PascalsTriangle(5);
    }
    public static void PascalsTriangle(int n) {
        if (n == 0) {
            return;
        }
        int rows = n;
        int cols = 2 * n + 1;
        int[][] arr = new int[rows][cols];
        arr[0][n] = 1;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (arr[i][j] != 0)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        return;
    }
}