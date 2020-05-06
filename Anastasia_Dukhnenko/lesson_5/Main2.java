public class Main2 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = a % b;
        if (c == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
