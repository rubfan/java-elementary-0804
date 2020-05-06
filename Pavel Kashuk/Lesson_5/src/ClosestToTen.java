// 3) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

public class ClosestToTen {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = closestToTenMethod(a, b);
        if (a == b) {
            System.out.println("Both numbers are equally close to 10");
        } else {
            System.out.println("Closest to ten is: " + c);
        }
    }
    static int closestToTenMethod(int a,int b) {
        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);
        if (a1 < b1) {
            return a;
        } else {
            return b;
        }
    }
}