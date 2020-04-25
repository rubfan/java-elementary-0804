public class Paragraph2 {
    public static void main(String[] args) {
        int var1 = Integer.parseInt(args[0]);
        int var2 = Integer.parseInt(args[1]);
        int var3 = Integer.parseInt(args[2]);
        System.out.println((var1 > var2 ? (var1 > var3 ? var1 : var3) : (var2 > var3 ? var2 : var3)));
    }
}
