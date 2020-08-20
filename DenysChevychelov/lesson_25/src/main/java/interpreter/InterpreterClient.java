package interpreter;

public class InterpreterClient {
    public static void main(String[] args) {
        String str1 = "AKSJF to lower case";
        String str2 = "dfgjhd to upper case";

        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + " = " + ec.convert(str1));
        System.out.println(str2 + " = " + ec.convert(str2));
    }

    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext context) {
        this.interpreterContext = context;
    }

    public String convert(String data) {
        Expression expression;
        if (data.contains("upper")) {
            expression = new UpperCaseExpression(data.substring(0, data.indexOf(" ")));
        } else if (data.contains("lower")) {
            expression = new LowerCaseExpression(data.substring(0, data.indexOf(" ")));
        } else return data;
        return expression.interpret(this.interpreterContext);
    }
}
