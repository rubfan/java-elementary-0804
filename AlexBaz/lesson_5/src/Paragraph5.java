public class Paragraph5 {
    public static void main(String[] args) {
        Float a = Float.parseFloat(args[0]);
        char sign = args[1].charAt(0);
        Float c = Float.parseFloat(args[2]);
        if (sign == '+') {
            System.out.println( a + c);
        }
        if (sign == '-') {
            System.out.println( a - c);
        }
        if (sign == '*') {
            System.out.println( a * c);
        }
        if (sign == '/') {
            System.out.println( a / c);
        }
        if (sign == '%') {
            System.out.println( a % c);
        }
        if (sign == '|') {
            System.out.println( Math.abs(a));
            System.out.println( Math.abs(c));
        }



    }
}
