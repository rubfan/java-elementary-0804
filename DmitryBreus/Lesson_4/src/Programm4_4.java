public class Programm4_4
{
    static double a,b,c=0;
    public static void main(String[] args) {
        String msg="";
        try {
            a =Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
           double C; //c = Integer.decode(args[2]);


            C=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            //System.out.println(c);
            msg= "Введены аргументы: катет1= " +
                    args[0] + "  катет2= " + args[1] +
                    " гипотинуза= "  + String.valueOf(C);
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
