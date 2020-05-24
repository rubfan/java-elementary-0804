public class Task_1 {
    public static void main(String[] args) {
        Pascal(8);
    }

    public static int[][] Pascal(int x) {
        int indent = x;
        int[][] pas = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    pas[i][j] = 1;
                }
                else {
                    pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
                }

                String co = " %" + indent * 2 + "d";
                if (j == 0) {
                    System.out.printf(co, pas[i][j]);
                } else if (pas[i][j] < 10) {
                    System.out.printf("   %d", pas[i][j]);
                } else {
                    System.out.printf("  %d", pas[i][j]);
                }
            }
            System.out.println();
            indent--;
        }
        return pas;
    }
}
