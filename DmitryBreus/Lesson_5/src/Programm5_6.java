import java.util.Scanner;

public class Programm5_6
{
    public static void main(String[] args)
    {
        String msg;
        String[] servsLevel=new String[5];
        servsLevel[0]="terrible (0%)";
        servsLevel[1]="poor (5%)";
        servsLevel[2]="good (10%)";
        servsLevel[3]="great (15%)";
        servsLevel[4]="excellent (20%)";
        int curServ=0;
        double Summ=0, Pay=0;
        String str;
        if (args.length==0)
        {
            System.out.println("Программа Чаевые");
            System.out.println("Введите сумму оплаты и" +
                    " уровень сервиса от 0-4. Например 200 3");
            Scanner in = new Scanner(System.in);
            msg = in.nextLine();
            int findIndex=msg.indexOf(" ");
            str =msg.substring(0,findIndex);
            Summ=Float.valueOf(str);
            str =msg.substring(findIndex+1);
            curServ=Integer.valueOf(str);
            if (curServ>args.length)
            {
                System.out.println("Превышен уровень сервиса!!!");
                return;
            }
        }//if (args.length==0)
        if (args.length!=0)
        {
            System.out.println("Программа Чаевые");
            if (args.length!=2)
            {
                System.out.println("Введите сумму оплаты и" +
                        " уровень сервиса от 0-4. Например 200 3");
                return;
            }
            if (args.length==2)
            {
                Summ=Float.valueOf(args[0]);
                curServ=Integer.valueOf(args[1]);
                System.out.println("Введены сумма: "+ Summ +
                        " уровень сервиса: " +curServ);
                if (curServ>args.length)
                {
                    System.out.println("Превышен уровень сервиса!!!");
                    return;
                }
            }
        }//if (args.length!=0)
             //расчет формулы оценки сервиса: 5*curServ[в процентах]
             //расчет суммы к оплате Summ+5*curServ*Summ/100=Summ(1+0,05*curServ)
             Pay=Summ*(1+0.05*curServ);
             System.out.println("Итоговая сумма к оплате " +(float)Pay+
                " с учетом сервиса " +servsLevel[curServ]);

    }
}
