public class Task7 {
    public static void main(String[] args) {
        int[] array = {7, 75, 61, 31, 16, 10, 25, 52, 57, 58, 65, 50, 54, 14, 83, 13, 88, 27, 11, 2};
        int evenSum = 0;
        int oddSum = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenSum += element;
            } else {
                oddSum += element;
            }
        }
        System.out.println("Even elements sum: " + evenSum);
        System.out.println(" Odd elements sum: " + oddSum);
    }
}
