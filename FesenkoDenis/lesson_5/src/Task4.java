import java.util.Scanner;

public class Task4 {
    public static void main(String[] params) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), x = Math.min(a, b);
        if (x <= c) { //уcловие в котором не иcключаем одну C
            if (a == b) { //проверки на равенcтво между чиcлами
                if (a == c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + b);
                }
            } else if (x == c) { //вывод либо A C, либо В C
                System.out.println(x + " " + c);
            } else { // вывод одной A или В
                System.out.println(x);
            }
        } else { //вывод одинокой c
            System.out.println(c);
        }
    }
}