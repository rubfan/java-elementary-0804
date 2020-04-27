// 3) Написать программу которая на вход метода main получает 3 числа из командной строки
// которая возводит первое число в степень второго числа и выводит в системе счисления введеной третим числом

public class PowNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int pow = (int) Math.pow(a, b);
        int c = Integer.parseInt(args[2]);
        String result = Integer.toString(pow,c);
        System.out.println(result);
    }
}