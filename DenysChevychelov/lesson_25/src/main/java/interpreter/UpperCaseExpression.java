package interpreter;

public class UpperCaseExpression implements Expression {
    private String expression;

    public UpperCaseExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.convertToUpperCase(this.expression);
    }
}
