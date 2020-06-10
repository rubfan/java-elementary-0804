public class Programm4_2
{
    static int a,b,c,result,Res;
    public static void main(String[] args) {
        String msg="";
        try {
            a = Integer.decode(args[0]);
            b = Integer.decode(args[1]);
            c = Integer.decode(args[2]);

         Res=Math.max(a,b);
         //result=45;
         result =Res>c ? Res: (Res=Math.max(Res,c));

            msg= "Введены аргументы: степень= " +
                    args[0] + "  основание= " + args[1] +
                    " система исчисления" + args[2]+
                    ". Мах значение:" +String.valueOf(Res);

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
