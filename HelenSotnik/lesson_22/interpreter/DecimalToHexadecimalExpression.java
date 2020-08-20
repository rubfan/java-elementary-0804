package interpreter;

public class DecimalToHexadecimalExpression implements Expression {
    private int number;

    public DecimalToHexadecimalExpression(int number) {
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
        System.out.println("Decimal to Hexadecimal interpretation of number " + number + ":");
        return interpreter.changeDecimalToHexadecimalFormat(number);
    }
}
