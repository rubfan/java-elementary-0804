// 4) Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа

public class FindMinNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a <= b && a <= c) {
            System.out.printf("%s is smallest" + "\n", a);
        }
        if (b <= a && b <= c) {
            System.out.printf("%s is smallest" + "\n", b);
        }
        if (c <= a && c <= b) {
            System.out.printf("%s is smallest" + "\n", c);
        }
    }
}