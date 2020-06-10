package task7;

import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Input array's lenght: ");
        int n = scan.nextInt();
        int sumEven = 0, sumOdd = 0;
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++)
            intArr[i] = rand.nextInt(100);
        for (int i = 0; i < n; i++)
            if(intArr[i] % 2 == 0) sumEven += intArr[i];
            else sumOdd += intArr[i];
        System.out.println("sumEven = " + sumEven + "\nsumOdd = " + sumOdd);
    }
}
