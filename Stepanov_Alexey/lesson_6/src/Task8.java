public class Task8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i < 1000000; i++) {
            int sumLeft = i / 100000 + i / 10000 % 10 + i / 1000 % 10;
            int sumRight = i / 100 % 10 + i / 10 % 10 + i % 10;
            if (sumLeft == sumRight) {
                count++;
            }
        }
        System.out.println("Lucky tickets number in the range of 100000-999999: " + count);
    }
}
