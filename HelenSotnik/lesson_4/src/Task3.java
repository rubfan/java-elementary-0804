public class Task3 {
    public static void main(String[] args) {
        int a,b,numSys;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        numSys = Integer.parseInt(args[2]);
        int c = (int) Math.pow(a, b);
        String x = Integer.toString(c,numSys);
        System.out.println("1st number to the power of 2nd number in chosen numeral system : " + x);
    }
}
