import java.util.Objects;

public class Main4 {
    public static void main(String[] params) {
        double a = Double.parseDouble(params [0]);
        String i = params[1];
        double b = Double.parseDouble(params [2]);
        if (Objects.equals(i, "*")) {
            System.out.println(a * b);
        } else if (Objects.equals(i, "/")) {
            System.out.println(a / b);
        } else if (Objects.equals(i, "+")) {
            System.out.println(a + b);
        } else if (i.equals("-")) {
            System.out.println(a - b);
        } else if (Objects.equals(i, "%")) {
            System.out.println(a % b);
        } else if (Objects.equals(i, "mod")) {
            System.out.println(Math.abs(a));
            System.out.println(Math.abs(b));
        }
    }
}
