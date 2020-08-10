import java.util.Scanner;

public class Programm11_5 {
    static int counter,counterRecurcy;
    public static void main(String[] args) {
        System.out.println("Введите порядок последовательности:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i != n; i++) {
            System.out.printf("%s ", funcFibo(i));
        }
        System.out.printf("\nДля %s прорядка o(n)=%s",n,counter);
        System.out.println("\nRecurcy:");
        for (int i = 0; i != n; i++) {
            System.out.printf("%s ", funcFiboRecurcy(i));
        }
        System.out.printf("\nДля %s прорядка o(n)=%s",n,counter);
    }

    public static int funcFibo(int n) {
        int fibo = 0;
        int fibo0 = 1;
        int fibo1 = 1;
        counter=3;
        counter++;
        if (n == 0) {
            counter++;
            return fibo0;
        }
        counter++;
        if (n == 1) {
            counter++;
            return fibo1;
        }
        counter= counter+2;
        for (int i = 1; i != n; i++) {
            counter=counter+2;
            fibo = fibo0 + fibo1;
            fibo0 = fibo1;
            fibo1 = fibo;
            counter=counter+4;
        }
        counter++;
        return fibo;
    }

    public static int funcFiboRecurcy(int n) {
        int result = 1;
        counter=1;
        if (n == 1) {
            result = 1;
            counter++;
            return result;
        }
        if (n == 0) {
            result = 1;
            counter++;
            return result;
        }
        if (n > 1) {
            result = funcFiboRecurcy(n - 2) + funcFiboRecurcy(n - 1);
            counter++;
            return result;
        }
        return result;
    }
}