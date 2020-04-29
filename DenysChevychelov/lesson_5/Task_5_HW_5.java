public class calculator {
    public static void main(String[] args) {
        if (args[0].equals("abs")) {
            System.out.println(Math.abs(Float.parseFloat(args[1])));
        } else {
            float firstNumber = Float.parseFloat(args[0]);
            float secondNumber = Float.parseFloat(args[2]);
            char mathOperator = args[1].charAt(0);
            if (mathOperator == '*') {
                System.out.println(firstNumber * secondNumber);
            } else if (mathOperator == '/') {
                System.out.println(firstNumber / secondNumber);
            } else if (mathOperator == '+') {
                System.out.println(firstNumber + secondNumber);
            } else if (mathOperator == '*') {
                System.out.println(firstNumber - secondNumber);
            } else if (mathOperator == '%') {
                System.out.println(firstNumber % secondNumber);
            }
        }
    }
}
