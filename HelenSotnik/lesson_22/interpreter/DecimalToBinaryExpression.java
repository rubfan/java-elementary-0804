package interpreter;

public class DecimalToBinaryExpression implements Expression {
    private int number;

    public DecimalToBinaryExpression(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Interpreter interpreter) throws NullPointerException {
        System.out.println("Decimal to Binary interpretation of number " + number + ":");
        return interpreter.changeDecimalToBinaryFormat(number);
    }
}
