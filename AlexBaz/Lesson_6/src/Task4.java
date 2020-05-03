public class Task4 {
    public static void main(String[] args) {
        int maxNumber = 1;
        for (int i = 1; maxNumber <= 20; i *= 2) {
            System.out.println(i);
            maxNumber++;
        }
    }
}
