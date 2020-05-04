import java.util.Scanner;
public class Programm5_3
{
    public static void main(String[] args)
    {
        int a,b,Res;
        System.out.println("Программа определение вводимых чисел ближайщих к 10-ти " );
        String msg="";
        System.out.println("Введите 1-е число" );
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Введите 2-е число" );
        b=in.nextInt();
        if (a>10 && b>10)
        {
            msg="Вводимые оба числа больше 10";
            System.out.println(msg);
            return;
        }
        if (a>10 && b<=10)
        {
            Res=Math.min(10,b);
            msg="Вводимое число "+b+" ближе к 10";
            System.out.println(msg);
            return;
        }
        if (a<=10 && b>10)
        {
            Res=Math.min(10,a);
            msg="Вводимое число "+a+" ближе к 10";
            System.out.println(msg);
            return;
        }
        else
            {
                Res=Math.max(a,b);
                msg="Вводимое число "+Res+" ближе к 10";
                System.out.println(msg);
        }


        }



}
