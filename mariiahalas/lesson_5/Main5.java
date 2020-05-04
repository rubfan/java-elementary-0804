package task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
        System.out.println(firstNum + " % " + secondNum + " = " + (firstNum%secondNum));
        System.out.println("|" + firstNum + "| = " + Math.abs(firstNum) + "\n|" + secondNum + "| = " + Math.abs(secondNum));
    }
}
