package Lesson6;
/*
2) Создайте программу, выводящую на экран первые 55 элементов последовательности
1 3 5 7 9 11 13 15 17 ….
 */

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1, j = 0; j < 55; j++, i += 2) {
            System.out.println(i);
        }
    }
}
