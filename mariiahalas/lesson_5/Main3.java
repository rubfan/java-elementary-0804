package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int first = Math.abs(firstNum - 10);
        int second = Math.abs(secondNum - 10);
        if(first < second) System.out.println(firstNum + " is closer to 10");
        else System.out.println(secondNum + " is closer to 10");
    }
}
