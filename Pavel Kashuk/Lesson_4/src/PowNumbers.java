// 3) Написать программу которая на вход метода main получает 3 числа из командной строки
// которая возводит первое число в степень второго числа и выводит в системе счисления введеной третим числом

public class PowNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int pow = (int) Math.pow(a, b);
        int c = Integer.parseInt(args[2]);
        String binary = Integer.toBinaryString(pow);
        String octal = Integer.toOctalString(pow);
        String hex = Integer.toHexString(pow);
        String res = c == 2 ? binary : c == 8 ? octal : c == 16 ? hex : c == 10 ? String.valueOf(pow) : "Entered system doesn't exist";
        System.out.println("Your first entered value is: " + a);
        System.out.println("Your second entered value is: " + b);
        System.out.println(a + " in " + b + " degree is: " + pow);
        System.out.println(res);
    }
}