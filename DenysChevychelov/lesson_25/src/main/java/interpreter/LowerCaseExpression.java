package interpreter;

public class LowerCaseExpression implements Expression {
    private String expression;

    public LowerCaseExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.convertToLowerCase(this.expression);
    }
}
