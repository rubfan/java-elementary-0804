import java.util.Scanner;

public class Programm5_4 {
    public static void main(String[] args) {
        int a,b,c,Res,Res1;
        System.out.println("Программа определение минимального числа " +
                "из трех вводимых чисел" );
        Scanner in=new Scanner(System.in);
        System.out.println("Введите 1-е число" );
        a=in.nextInt();
        System.out.println("Введите 2-е число" );
        b=in.nextInt();
        System.out.println("Введите 3-е число" );
        c=in.nextInt();
        Res=Math.min(a,b);

        if (Res==c)
        {
            System.out.println("Мин число "+ Res );
            return;
        }

        if (Res>c)
        {
            if (a==b ||b==c)
            {
                System.out.println("Мин число "+ Res );
                return;
            }

            else
            {
                Res1 = Math.min(Res, c);
                System.out.println("Мин числа " + Res + " и " + c);
                return;
            }
        }

        if (Res<c)
        {
            if (a==b ||b==c)
            {
                System.out.println("Мин число "+ Res );
                return;
            }

            else
            {
                Res1=Math.min(Res,c);
                System.out.println("Мин числа "+ a + " и "+b );
                return;
            }

        }







    }
}
