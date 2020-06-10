import java.util.Scanner;
public class Programm5_1 {
    public static void main(String[] args) {
        int a,Res;
        String msg;
        System.out.println("Проверка на четность числа. Введите число");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        Res=a%2;
        if (Res==0) msg="Число четное";
        else msg="Число нечетное";
        System.out.println(msg);
    }
}
