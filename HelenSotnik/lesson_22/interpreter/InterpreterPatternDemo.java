package interpreter;

public class InterpreterPatternDemo {
    public static void main(String[] args) throws NullPointerException {
        Interpreter interpreter = new Interpreter();

        Expression expression = new DecimalToBinaryExpression(89);
        System.out.println(expression.interpret(interpreter));

        expression = new DecimalToOctalExpression(23345);
        System.out.println(expression.interpret(interpreter));

        expression = new DecimalToHexadecimalExpression(195);
        System.out.println(expression.interpret(interpreter));
    }
}
