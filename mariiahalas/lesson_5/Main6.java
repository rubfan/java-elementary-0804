package task6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sum: ");
        double sum = scanner.nextDouble();
        System.out.println("Input answer: ");
        String answer = scanner.next();
        String str1 = "terrible", str2 = "poor", str3 = "good", str4 = "great",  str5 = "excellent";
        if(answer.equals(str1)) System.out.println("You need to pay " + sum);
        else if(answer.equals(str2)) System.out.println("You need to pay " + (sum + (0.05*sum)));
        else if(answer.equals(str3)) System.out.println("You need to pay " + (sum + (0.1*sum)));
        else if(answer.equals(str4)) System.out.println("You need to pay " + (sum + (0.15*sum)));
        else if(answer.equals(str5)) System.out.println("You need to pay " + (sum + (0.2*sum)));
        else System.out.println("Wrong answer!!!");
    }
}
