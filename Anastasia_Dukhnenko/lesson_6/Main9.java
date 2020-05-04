import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scan.nextInt();
        System.out.println("Введите номер бита: ");
        int position = scan.nextInt();
        int a = value | (1 << (position - 1));
        System.out.println("Число в двоичной системе: " + Integer.toBinaryString(a));
        System.out.println("Число в десятеричной системе: " + Integer.toString(a));

    }
}

