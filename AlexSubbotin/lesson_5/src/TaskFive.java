public class TaskFive {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        String arithmeticAction = args[1];
        double b = Double.parseDouble(args[2]);

        if (arithmeticAction.equals("*")) {
            System.out.println(a * b);
        }

        if (arithmeticAction.equals("/")) {
            System.out.println(a / b);
        }

        if (arithmeticAction.equals("+")) {
            System.out.println(a + b);
        }

        if (arithmeticAction.equals("-")) {
            System.out.println(a - b);
        }

        if (arithmeticAction.equals("%")) {
            System.out.println(a % b);
        }

        if (arithmeticAction.equals("abs a")) {
            System.out.println(Math.abs(a));
        }

        if (arithmeticAction.equals("abs b")) {
            System.out.println(Math.abs(b));
        }
    }
}
