package interpreter;

public class Client {
    private Context context;

    public Client(Context context) {
        this.context = context;
    }

    public static void main(String[] args) {
        String binary = "256 in Binary: ";
        String octal = "256 in Octal: ";
        String hexadecimal = "256 in Hexadecimal: ";

        Client expression = new Client(new Context());
        System.out.println(binary + expression.interpret(binary));
        System.out.println(octal + expression.interpret(octal));
        System.out.println(hexadecimal + expression.interpret(hexadecimal));
    }

    private String interpret(String text) {
        Expression expression;

        int number = Integer.parseInt(text.substring(0, text.indexOf(" ")));

        if (text.contains("Binary")) {
            expression = new BinaryExpression(number);
        } else if (text.contains("Octal")) {
            expression = new OctalExpression(number);
        } else if (text.contains("Hexadecimal")) {
            expression = new HexadecimalExpression(number);
        } else {
            return text;
        }

        return expression.interpret(context);
    }
}
