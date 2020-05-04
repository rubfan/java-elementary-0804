public class Task8 {
    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            int sumLeft = i / 100000 + i / 10000 % 10 + i / 1000 % 10;
            int sumRight = i / 100 % 10 + i / 10 % 10 + i % 10;
            if (sumLeft == sumRight) {
                System.out.println("Lucky ticket! # " + i);
            }
        }
    }
}
