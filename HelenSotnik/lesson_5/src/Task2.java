public class Task2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        if (n1 % n2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
