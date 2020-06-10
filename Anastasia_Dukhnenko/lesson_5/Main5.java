import java.util.Objects;

public class Main5 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params [0]);
        String b = params [1];
        System.out.println("Total: " + a);
        int a1 = 0;
        int a2 = 5 * a / 100;
        int a3 = 10 * a / 100;
        int a4 = 15 * a / 100;
        int a5 = 20 * a / 100;
        if (Objects.equals(b, "Terrible")) {
            System.out.println("Terrible (0%): " + a1);
        } else if (Objects.equals(b, "Poor")) {
            System.out.println("Poor (5%): " + a2);
        } else if (Objects.equals(b, "Good")) {
            System.out.println("Good (10%): " + a3);
        } else if (Objects.equals(b, "Great")) {
            System.out.println("Great (15%): " + a4);
        } else if (Objects.equals(b, "Excellent")) {
            System.out.println("Excellent (20%): " + a5);
        }
    }
}
