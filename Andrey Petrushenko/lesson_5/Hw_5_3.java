public class Hw_5_3 {
    public static void main(String[] args) {
        int a=Integer.parseInt (args[0]);
        int c=Integer.parseInt (args[1]);
        byte b =10;
        a=b-a;
        c=b-c;
        if (Math.abs(a)<Math.abs(c)){
            System.out.println("closest to 10 first number " );
        }
        else{
            System.out.println("closest to 10 second number ");
        }
    }
}
