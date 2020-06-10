package task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if(firstNum%secondNum == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
