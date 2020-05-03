package task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int min;
        if(Math.min(firstNum,secondNum) == Math.min(firstNum, thirdNum)) min=firstNum;
        else if(Math.min(firstNum,secondNum) == Math.min(secondNum, thirdNum)) min = secondNum;
        else min = thirdNum;
        if( min == secondNum && min ==thirdNum) System.out.println(min + " " + min + " " + min);
        else if( min == secondNum || min == thirdNum) System.out.println(min + " " + min);
        else System.out.println(min);
    }
}
