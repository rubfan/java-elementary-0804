public class TernaryOperator {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int d = a > b ? a : b;
        int d1 = d > c ? d : c;
        System.out.println("Наибольшее число: " + d1);
    }
}
