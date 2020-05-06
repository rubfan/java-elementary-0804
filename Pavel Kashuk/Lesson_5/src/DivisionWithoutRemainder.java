// 2) Даны 2 числа, определить делится ли первое число на второе без остатка, выведите на экран ответ YES / NO

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}