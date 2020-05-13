package Lesson6;
/*
4) Создайте программу, выводящую на экран первые 20 элементов последовательности
2 4 8 16 32 64 128 ….
 */

public class Task4 {
    public static void main(String[] args) {
        for (int i = 2, j = 0; j < 20; j++, i <<= 1) {
            System.out.println(i);
        }
    }
}
