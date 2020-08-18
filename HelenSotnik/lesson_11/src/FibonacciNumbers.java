package homework;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number which is an index in Fibonacci numbers row");
        int n = scanner.nextInt();

        System.out.println(n + "-member in Fibonacci row : " + fibonacci(n));
        System.out.println(n + "-member in Fibonacci row solved with recursion: " + fibonacciR(n));
        complexityOfSolution();
    }

    protected static int fibonacci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 2; i <= n; i++) {
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }
        return fib2;
    }

    protected static int fibonacciR(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacciR(n - 1) + fibonacciR(n - 2);
        }
    }

    protected static String complexityOfSolution() {
        return "Complexity of method fibonacci is O(n) while\n" +
                "Complexity of method fibonacciR(recursive) is 2^O(n), which is much longer\n";
    }
}
