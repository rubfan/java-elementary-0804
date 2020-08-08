package interpreter;

public class OctalExpression implements Expression {
    private int number;

    public OctalExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Context context) {
        return context.getOctalExpression(number);
    }
}
