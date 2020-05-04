import java.util.Scanner;

public class Programm5_5
{
    static int a,b;

    public static void main(String[] args)
    {
        String msg=null;
        String str=null;
        int findIndex=-1;
        float Res=0;
        if (args.length==0)
        {
            System.out.println("Программа калькулятор");
            System.out.println("Введите два числа и операцию вычисления. Например 2 + 2 или abs (-10)");
            Scanner in = new Scanner(System.in);
            msg = in.nextLine();

        }
        if (args.length!=0)
        {
        if (args.length==2) msg=args[0]+" "+args[1];
        if (args.length==3) msg=args[0]+" "+args[1]+ " "+args[2];
        }
        findIndex= msg.indexOf("(");//режим нахождение модуля числа
        if (findIndex!=-1)
        {
            str=msg.substring(findIndex+1,msg.length()-1);
            a=Integer.valueOf(str);
            Res = (float)Math.abs(a) ;
            System.out.println("Результат "+Res);
            return;
        }// if(findIndex!=-1)
        findIndex= msg.indexOf("*");
        if(findIndex!=-1)
        {
            str=msg.substring(0,findIndex-1);
            a=Integer.valueOf(str);
            str=msg.substring(findIndex+2);
            b=Integer.valueOf(str);
            Res=(float)(a*b);
            System.out.println("Результат "+Res);
            return;
        }//if(findIndex!=-1)
        findIndex= msg.indexOf("/");
        if (findIndex!=-1)
        {
            str=msg.substring(0,findIndex-1);
            float a1=Float.valueOf(str);
            str=msg.substring(findIndex+2);
            float b1=Float.valueOf(str);
            Res =a1/b1;
            System.out.printf("Результат %f",Res);
            return;
        }// if(findIndex!=-1)
        findIndex= msg.indexOf("+");
        if (findIndex!=-1)
        {
            str=msg.substring(0,findIndex-1);
            a=Integer.valueOf(str);
            str=msg.substring(findIndex+2);
            b=Integer.valueOf(str);
            Res = (float)(a+b);
            System.out.println("Результат "+Res);
            return;
        }// if(findIndex!=-1)
        findIndex= msg.indexOf("-");
        if (findIndex!=-1)
        {
            str=msg.substring(0,findIndex-1);
            a=Integer.valueOf(str);
            str=msg.substring(findIndex+2);
            b=Integer.valueOf(str);
            Res = (float)(a-b);
            System.out.println("Результат "+Res);
            return;
        }// if(findIndex!=-1)
        findIndex= msg.indexOf("%");
        if (findIndex!=-1)
        {
            str=msg.substring(0,findIndex-1);
            a=Integer.valueOf(str);
            str=msg.substring(findIndex+2);
            b=Integer.valueOf(str);
            Res =(float)(a%b);
            System.out.println("Результат остаток от делениях "+Res);
            return;
        }// if(findIndex!=-1)

    }
}
