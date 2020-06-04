public class Task5 {
    public static void main(String[] args) {
        // complexity O(N)
        System.out.println(fibonacciGetElementIterative(15));
        // complexity O(2^N)
        System.out.println(fibonacciGetElementRecursive(15));
    }

    public static int fibonacciGetElementIterative(int element) {
        int n1 = 1, n2 = 1;
        for (int i = 2; i < element; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }

    public static int fibonacciGetElementRecursive(int element) {
        if (element == 0) {
            return 0;
        }
        if (element == 1) {
            return 1;
        } else {
            return fibonacciGetElementRecursive(element - 1) + fibonacciGetElementRecursive(element - 2);
        }
    }
}