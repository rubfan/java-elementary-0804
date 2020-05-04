package task6;

import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Input array's lenght: ");
        int n = scan.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++)
            intArr[i] = rand.nextInt(100);
        int min = intArr[0], max = intArr[0];
        for (int i = 0; i < n; i++) {
            if(min > intArr[i]) min = intArr[i];
            if(max < intArr[i]) max = intArr[i];
        }
        System.out.println("min: " + min + "\nmax: " + max);
    }
}
