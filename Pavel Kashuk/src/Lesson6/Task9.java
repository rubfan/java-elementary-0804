package Lesson6;
/*
9) Создайте программу которая устанавливает введеный номер бита в 1 у введенного числа,
выведите на экран полученое число в двоичной и десятеричной системе счисления
 */

public class Task9 {
    public static void main(String[] args) {
        int value = 8;
        int bitNumber = 3;
        System.out.println("Decimal input: " + value);
        System.out.println("Convert to binary: " + Integer.toString(value,2));
        System.out.println("Number of bit to change: " + bitNumber);
        bitNumber--;
        int mask = 0;
        mask = 1 << bitNumber;
        value = value | mask;
        System.out.println("Result after change in binary: " + Integer.toString(value,2));
        System.out.println("Decimal result: " + value);
    }
}
