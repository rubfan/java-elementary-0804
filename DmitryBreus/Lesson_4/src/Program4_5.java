import java.util.Scanner;

public class Program4_5
{
    static int score1, score2, Leader,Looser;
    static Float persent;
    static String str1,str2, Command1,Command2;

    public static void main(String[] args) {
        String msg="";
        int findIndex;
        System.out.println("Введите команду№1 и ее количество очков" );
        Scanner in=new Scanner(System.in);
        str1=in.nextLine();
        System.out.println("Введите команду№2 и ее количество очков" );
        str2=in.nextLine();
        findIndex= str1.indexOf(" ");
        Command1=str1.substring(0,findIndex);
        score1=Integer.decode( str1.substring(findIndex+1));
        findIndex= str1.indexOf(" ");
        Command2=str2.substring(0,findIndex);
        score2=Integer.decode( str2.substring(findIndex+1));
        //Определяем ведущюю команду
        Leader=Math.max(score1,score2);
        Looser=Math.min(score1,score2);
        persent=((float)Looser * 100/ ((float)Leader));
        persent=100-persent;
        msg=Leader==score1 ? "Команда "+Command1 +" опережает команду "+
                Command2 +" на "+persent +"%":"Команда "+Command2 +
                " опережает команду "+ Command1 +" на "+persent +"%";
        System.out.println(msg);


    }
}
