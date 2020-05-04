import java.util.function.ToIntFunction;

public class Programm4_1
{
    static int i,a,b,Summ=0;
    public static void main(String[] args) {
        String msg="";
        try {
            a = Integer.decode(args[0]);
            b = Integer.decode(args[1]);
            Summ = a + b;
            msg= "Введены аргументы:" +
                    args[0] + " " + args[1] +
                    ". Их сумма:" +String.valueOf( Summ);


        }
        catch (Exception error) {
            msg = "Введены аргументы :"+ args.length;
        }
        finally {
        // args.length > 0
            System.out.println(msg);
        }
    }
}
