// 2) Написать программу которая на вход метода main получает 3 числа из командной строки
// и с использование тринарного оператора выводит на экран наибольшее из них

public class MaxValue {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("Your first entered value is: " + a);
        System.out.println("Your second entered value is: " + b);
        System.out.println("Your third entered value is: " + c);
        System.out.println("Max entered value is: " + result);
    }
}
