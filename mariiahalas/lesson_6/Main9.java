package task9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Input a number:  ");
        int num = scan.nextInt();
        System.out.println("Input a bit's number:  ");
        int bit = scan.nextInt();
        String binaryNum = Integer.toBinaryString(num);
        String binaryNum2 = "";
        for (int i = 0; i < binaryNum.length() ; i++)
            if(i == (binaryNum.length()-bit)) binaryNum2+=1;
            else binaryNum2 += "0";
        String result = "";
        for (int i = 0; i < binaryNum.length(); i++)
            result += String.valueOf(Integer.parseInt(String.valueOf(binaryNum.charAt(i))) | Integer.parseInt(String.valueOf(binaryNum2.charAt(i))));;
        System.out.println(result + " " + Integer.parseInt(result, 2));
    }
}
