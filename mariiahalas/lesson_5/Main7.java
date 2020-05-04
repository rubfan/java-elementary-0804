package task7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDays = scanner.nextInt();
        if(countDays > 5) System.out.println("You need yo pay " + ((countDays*40) - 20));
        else if(countDays > 7) System.out.println("You need yo pay " + ((countDays*40) - 50));
        else System.out.println("You need yo pay " + (countDays*40));
    }
}
