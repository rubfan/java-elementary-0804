public class HW_4_3 {
    public static void main (String[] args){
        int a=Integer.parseInt (args[0]);
        int b=Integer.parseInt (args[1]);
        int s=Integer.parseInt (args[2]);
        int rez= (int) Math.pow(a, b);
        String bin= Integer.toBinaryString(rez);
        String hex =Integer.toHexString(rez);
        String oct =Integer.toOctalString(rez);
        String type= (s==1)? type= hex:(s==2)? type=bin:(s==3)? type=oct: "";
        System.out.println(type);

    }

}
