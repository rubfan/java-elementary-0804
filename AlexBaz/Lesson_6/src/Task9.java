import java.util.Scanner;

public class Task9 {
        public static void main(String[] args) {
                Scanner scr = new Scanner(System.in);
                System.out.println("Введите номер изменяемого бита от 1 до 32");
                int numberBit = scr.nextInt();
                System.out.println("Введите число для изменений");
                int number =  scr.nextInt();
                numberBit--;
                int c = 0;
                c = 1 << numberBit;
                number = number ^ c;
                System.out.println( " двоичный вид " + number + ": " +Integer.toString(number, 2));
                System.out.println( " десятеричный вид " + number + ": " +Integer.toString(number, 10));
        }
}
