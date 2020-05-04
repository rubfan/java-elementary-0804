package task5;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Input array's lenght: ");
        int n = scan.nextInt();
        int sum = 0;
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++)
            intArr[i] = rand.nextInt(100);
        for (int i = 0; i < n; i++)
            sum += intArr[i];
        System.out.println(sum);
    }
}
