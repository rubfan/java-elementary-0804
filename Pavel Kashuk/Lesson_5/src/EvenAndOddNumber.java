// 1) Написать программу, которая проверит, является ли число четным или нечетным

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}