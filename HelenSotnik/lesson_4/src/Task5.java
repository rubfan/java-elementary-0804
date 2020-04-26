import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st football team name: ");
        String a1 = scanner.nextLine();
        System.out.println("Enter 2nd football team name: ");
        String b1 = scanner.nextLine();
        System.out.println("Enter score of " + a1 + " team: ");
        int a = scanner.nextInt();
        System.out.println("Enter score of " + b1 + " team: ");
        int b = scanner.nextInt();
        int max = (a >= b) ? a : b;
        int percentage = 100 * max / (a + b);
        String leader = (a > b) ? a1 : b1;
        String looser = (a < b) ? a1 : b1;
        if (a == b) {
            System.out.println("Draw in game! Score is equal! ");
        } else {
            System.out.println(leader + " is " + percentage + "% ahead, while " + looser + " is " + percentage + "% behind.");
        }
    }
}
