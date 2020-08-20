package interpreter;

public class Interpreter {
    public String changeDecimalToBinaryFormat(int number) {
        return Integer.toBinaryString(number);
    }

    public String changeDecimalToOctalFormat(int number) {
        return Integer.toOctalString(number);
    }

    public String changeDecimalToHexadecimalFormat(int number) {
        return Integer.toHexString(number);
    }
}
