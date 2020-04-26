public class Paragraph5 {
    public static void main(String[] args) {
        double var1 = Double.parseDouble(args[0]);
        double var2 = Double.parseDouble(args[1]);
        String var3 = args[2];
        String var4 = args[3];
        System.out.println((var1 > var2 ? (var3 + " wins " + var4 + " by " + (100-var2/(var1/100))+"%") : (var4 + " wins " + var3 + " by " + (100-var1/(var2/100))+"%")));
    }
}
