public class Paragraph3 {
    public static void main(String[] args) {
        double var1 = Double.parseDouble(args[0]);
        double var2 = Double.parseDouble(args[1]);
        int var3 = Integer.parseInt(args[2]);
        int num = (int)Math.pow(var1,var2);
        System.out.println(Integer.toString(num, var3));
    }
}
