import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer to initialize size of the triangle");
        int size = scanner.nextInt();

        triangle(size);
    }

    public static void triangle(int trSize) {
        for (int i = 0; i < trSize; i++) {
            int number = 1;
            System.out.format("%" + (trSize - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
