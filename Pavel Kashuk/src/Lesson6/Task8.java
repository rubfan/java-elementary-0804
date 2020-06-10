package Lesson6;
/*
8) Найти все счастливые билеты от 100000 до 999999 :
билет счастливый если сумма первых трех цифр равна сумме трех последних
например, 123312: 1+2+3==3+1+2
 */

public class Task8 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100_000; i < 1_000_000; i++) {
            int i1 = i / 100_000 % 10,
                    i2 = i / 10_000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
