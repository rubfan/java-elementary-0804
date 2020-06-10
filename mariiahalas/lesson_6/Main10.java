package task10;

import java.util.Random;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Input array's lenght: ");
        int n = scan.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++)
            intArr[i] = rand.nextInt(100);
        int max = intArr[0];
        for (int i = 0; i < n; i++)
            if(max < intArr[i]) max = intArr[i];
        int min1 = max;
        for (int i = 0; i < n; i++)
            if(min1 > intArr[i]) min1 = intArr[i];
        int min2 = max;
        for (int i = 0; i < n; i++)
            if(min2 > intArr[i] && intArr[i] != min1) min2= intArr[i];
        int min3 = max;
        for (int i = 0; i < n; i++)
            if(min3 > intArr[i] && intArr[i] != min2 && intArr[i] != min1) min3 = intArr[i];
        int min4 = max;
        for (int i = 0; i < n; i++)
            if(min4 > intArr[i] && intArr[i] != min3 && intArr[i] != min1 && intArr[i] != min2) min4 = intArr[i];
        int min5 =max;
        for (int i = 0; i < n; i++)
            if(min5 > intArr[i] && intArr[i] != min4 && intArr[i] != min2 && intArr[i] != min1 && intArr[i] != min3) min5 = intArr[i];
        System.out.println( min1 + " " + min2 + " " + min3 + " " + min4 + " " + min5);
    }
}
