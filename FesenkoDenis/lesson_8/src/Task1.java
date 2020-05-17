public class Task1 {

    public static void main(String[] args) {
        int[][] strings = new int[15][15];
        String[][] strings1 = new String[15][15];
        String[][] charStr = new String[15][15];
        strings[0][0] = 1;
        strings1[0][0] = "1"; // input first item of line
        for (int i = 1; i < strings.length; i++) {
            strings1[0][i] = "";
        }

        for (int i = 1; i < strings.length; i++) {
            strings[i][0] = 1;
            strings1[i][0] = "1";
            for (int j = 1; j < strings[i].length; j++) {
                strings[i][j] = strings[i - 1][j - 1] + strings[i - 1][j];
                strings1[i][j] = Integer.toString(strings[i][j]);
            }
        }

        for (int k = 0; k < charStr.length; k++) { // revers
            for (int l = charStr.length - 1, iter1 = 0; l >= 0; l--, iter1++) {
                if (iter1 < charStr.length) {
                    charStr[k][l] = strings1[k][iter1].replaceFirst("^0*", ""); //output without "0" at the beginning
                }
            }
        }
        showArray(charStr);
    }

    public static void showArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
