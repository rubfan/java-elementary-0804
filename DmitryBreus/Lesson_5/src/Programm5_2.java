import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Scanner;

public class Programm5_2
{
    public static void main(String[] args)
    {
        int a,b,Res;
        boolean bRes;
        String msg;
        System.out.println("Программа проверка четности при делении двух чисел");
        System.out.println ("Введите число делимое " );
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Введите число-делитель " );
        b=in.nextInt();
        Res=a%b;
        if (Res==0)
        {
        msg="Остаток от деления YES";
        }
        else
        {
            msg="Остаток от деления NO";
        }
        System.out.println(msg);


    }
}
