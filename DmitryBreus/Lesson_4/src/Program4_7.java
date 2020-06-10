public class Program4_7
{
    static int n,N;
    static int drink=100;
    static int V=750;
    static int Res, Ost;
    public static void main(String[] args) {
        String msg="";
        try {
            n =Integer.valueOf(args[0]);
            //на 1 человеку надо  100мл
            // для n человек надо будет n*100мл
            // 1бутылка=750мл
            // Для 2-х человек надо 2*100мл
            //Кол-во бутылок N=(200/750)+1=0+1
            //останок 1*750-2*100=350
            // Для 20-ти чел надо 20*100=2000мл
            //Кол-во бутылок N=(2000/750)+1=2+1
            //останок 3*750-20*100=150
            N=Math.floorDiv(n*drink,V)+1;
            //Для скольки человек 100мл надо на 1 бутылку
            Res =V%drink;
            Ost=n>=Res ? (N*V)%(n*drink):N*V-n*drink;

            msg= "Введены аргументы: число человек= " +
                    args[0] + ", понадобится "+
                    String.valueOf(N)+ " бутылок и еще останется "+
                    String.valueOf(Ost)+"мл";


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
