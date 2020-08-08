public class TaskFour {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean firstCheck = a <= b && a <= c;
        boolean secondCheck = b <= a && b <= c;
        boolean thirdCheck = c <= b && c <= a;
        if (firstCheck) {
            System.out.println(a);
        }
        if (secondCheck) {
            System.out.println(b);
        }
        if (thirdCheck) {
            System.out.println(c);
        }
    }
}
