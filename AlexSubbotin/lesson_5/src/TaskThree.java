public class TaskThree {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean caseOne = a <= 10 && b <= a;
        boolean caseTwo = a >= 10 && b >= a;

        if (caseOne | caseTwo) {
            System.out.println(a + " closest to 10");
        } else {
            System.out.println(b + " closest to 10");
        }
    }
}
