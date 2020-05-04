public class Task8 {
    public static void main(String[] args) {
        for (int a = 100000; a <= 999999; a++) {
            int b = a;
            int a1, a2, a3, a4, a5, a6;
            a1 = a / 100000;
            b = a % 100000;
            a2 = b / 10000;
            b %= 10000;
            a3 = b / 1000;
            b %= 1000;
            a4 = b / 100;
            b %= 100;
            a5 = b / 10;
            b %= 10;
            a6 = b;
            if ((a1 + a2 + a3) == (a4 + a5 + a6)) {
                System.out.println("Lucky ticket: " + a);
            }
        }
    }
}
