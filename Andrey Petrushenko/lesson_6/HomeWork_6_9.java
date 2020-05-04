import java.util.Scanner;

public class HomeWork_6_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int num = scan.nextInt();
        System.out.println("Введите номер бита");
        int nb = scan.nextInt();
        num = 1 << nb;
        System.out.println(Integer.toBinaryString(num | nb));
        System.out.println(Integer.parseInt(String.valueOf(num | nb)));

    }
}
