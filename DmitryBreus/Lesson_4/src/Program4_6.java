public class Program4_6
{
    static double r, h, V;
    public static void main(String[] args) {
        String msg="";
        try {
            r =Double.valueOf(args[0]);
            h =Double.valueOf(args[1]);
           // c = Integer.decode(args[2]);

            V= Math.pow(r,2);
            V=Math.PI*V*h;

            msg= "Введены аргументы: радус цилиндра= " +
                    args[0] + "  высота цилиндра= " + args[1]+
                    " Объем цилиндра=" +String.valueOf((float)V);

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
