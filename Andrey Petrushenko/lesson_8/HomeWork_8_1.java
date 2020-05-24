public class HomeWork_8_1 {
    public static void main(String[] args) {
        int numOfRows = 8;
        int r;
        int num = 1;
        for (int i = 0; i <= numOfRows; i++) {
            r = i + 1;
            for (int j = numOfRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                if (num < 10) {
                    System.out.print(num + "  ");
                } else {
                    System.out.print(num + " ");
                }

            }
            System.out.println();
        }
    }
}
