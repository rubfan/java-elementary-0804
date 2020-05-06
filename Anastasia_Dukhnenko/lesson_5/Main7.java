public class Main7 {
    public static void main(String[] params) {
        double a = Double.parseDouble(params [0]);
        double b = Double.parseDouble(params [1]);
        double c = Double.parseDouble(params [2]);
        double min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        if (min == a && min == b) {
            System.out.println(a);
            System.out.println(b);
        } else if (min == a && min == c) {
            System.out.println(a);
            System.out.println(c);
        } else if (min == b && min == c) {
            System.out.println(b);
            System.out.println(c);
        } else {
            System.out.println(min);
        }
    }
}
