public class Task5 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
		String arithmeticAction = args[1];
        double n2 = Double.parseDouble(args[2]);
        if (arithmeticAction.equals("*")) {
            System.out.println("Multiplication" + (n1 * n2));
        }
        if (arithmeticAction.equals("/")) {
            System.out.println("Division: " + (n1 / n2));
        }
        if (arithmeticAction.equals("+")) {
            System.out.println("Addition: " + (n1 + n2));
        }
        if (arithmeticAction.equals("-")) {
            System.out.println("Subtraction: " + (n1 - n2));
        }
        if (arithmeticAction.equals("%")) {
            System.out.println("Division remainder: " + (n1 % n2));
        }
        if (arithmeticAction.equals("abs")) {
            System.out.println("Module of 1st number: " + Math.abs(n1));
            System.out.println("Module of 2nd number: " + Math.abs(n2));
        }
    }
}
