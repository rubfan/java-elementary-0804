//1) Написать программу которая на вход метода main получает 2 числа из командной строки и их сумму выводит на экран

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Hello! This program will adding two numbers.");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int res = a + b;
        System.out.println("Your first entered number is: " + a);
        System.out.println("Your second entered number is: " + b);
        System.out.println("The sum is: " + res);
    }
}