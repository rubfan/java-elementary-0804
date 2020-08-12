package interpreter;

public interface Expression {
    public String interpret(Interpreter interpreter) throws NullPointerException;
}

