import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the 1st leg in rectangular triangle ");
        double a = scanner.nextDouble();
        System.out.println("Enter length of the 2nd leg in rectangular triangle ");
        double b = scanner.nextDouble();
        System.out.println("Length of hypotenuse equals " + Math.sqrt(a * a + b * b));
    }
}