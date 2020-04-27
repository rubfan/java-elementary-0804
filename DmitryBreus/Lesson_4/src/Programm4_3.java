import com.sun.corba.se.impl.orbutil.HexOutputStream;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import com.sun.org.apache.xpath.internal.operations.Variable;

public class Programm4_3
{
    static double a,b,Res;
    //static double result;
    static int result,R, c;
    static String stRes;
    public static void main(String[] args) {
        String msg="";
        try {
            a =Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
            c = Integer.decode(args[2]);


            Res=Math.pow(b,a);
            R=(int) Res;

            //System.out.println(Integer.toHexString(R));
            //System.out.println(Integer.toBinaryString(R));

            //stRes=Integer.toBinaryString((int)Res);
            stRes= c==16 ? Integer.toHexString(R)+"H": ( c==10? String.valueOf(R) :
                    Integer.toBinaryString(R)+"B") ;

            msg= "Введены аргументы: степень= " +
                    args[0] + "  основание= " + args[1] +
                    " система исчисления= " + args[2]+
                    ". Значение= " + stRes;

            //Integer.parseInt(15);
            //System.out.println(Long.parseLong("FF",16));
            //System.out.println(Integer.toHexString(128));
            //System.out.println(Integer.toBinaryString(128));
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
