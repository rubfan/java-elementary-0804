package interpreter;

public class DecimalToOctalExpression implements Expression {
    private int number;

    public DecimalToOctalExpression(int number) {
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
        System.out.println("Decimal to Octal interpretation of number " + number + ":");
        return interpreter.changeDecimalToOctalFormat(number);
    }
}
