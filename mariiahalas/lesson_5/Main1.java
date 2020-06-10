package task1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
         if(num%2 == 0) System.out.println("It's even");
         else System.out.println("It's odd");
    }
}
