import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of cylinder: ");
        double h = scanner.nextDouble();
        System.out.println("Enter its radius: ");
        double r = scanner.nextDouble();
        double v = Math.PI * r * r * h;
        System.out.println("The volume of cylinder equals " + v);
    }
}