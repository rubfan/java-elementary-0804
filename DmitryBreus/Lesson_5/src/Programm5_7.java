import java.util.Scanner;

public class Programm5_7
{
    public static void main(String[] args)
    {
        String msg;
        int baseDay=5;
        int priceDay=40;
        int QlityDays=0;
        double Summ=0, Pay=0;
        String str;
        if (args.length==0)
        {
            System.out.println("Программа Оренда жилья");
            System.out.println("Введите количество дней");
            Scanner in = new Scanner(System.in);
            QlityDays = in.nextInt();
        }//if (args.length==0)
        if (args.length!=0)
        {
            System.out.println("Программа Оренда жилья");
            if (args.length!=1)
            {
                System.out.println("Введено аргументов больше 1");
                return;
            }
            if (args.length==1)
            {
                QlityDays=Integer.valueOf(args[0]);
                System.out.println("Введено количество дней "+ QlityDays);
            }
        }//if (args.length!=0)
        //если меньше 5-ти дней
        if (QlityDays<=baseDay)
        {
            Summ = QlityDays * priceDay;
        }
        //если больше 5-ти дней до меньше 7-ми дней
        if (QlityDays>=baseDay && QlityDays<baseDay+2)
        {
            Summ = QlityDays*priceDay-20;
        }
        //если больше 7-ми дней
        if (QlityDays>=baseDay+2)
        {
            Summ =QlityDays*priceDay-50;
        }
        System.out.println("Итоговая сумма к оплате "+ Summ);
    }
}
