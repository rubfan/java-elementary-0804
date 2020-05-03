public class Task4 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int min = n1;
        if (n2 <= min) {
            System.out.println("min " + n2);
        }
        if (n3 <= min) {
            System.out.println("min " + n3);
        }
        if (n1 <= min) {
            System.out.println("min " + n1);
        }
    }
}
