public class Main3 {
    public static void main(String[] params) {
        double a = Double.parseDouble(params [0]);
        double b = Double.parseDouble(params [1]);
        double first = Math.abs(10 - a);
        double second = Math.abs(10 - b);
        if (first > second) {
            first = b;
        } else if (first < second) {
            first = a;
        }
        System.out.println(first);
    }
}
