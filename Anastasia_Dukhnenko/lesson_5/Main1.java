public class Main1 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = a % 2;
        if (b == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }
    }
}
