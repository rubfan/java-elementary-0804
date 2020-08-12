package interpreter;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(15, 35);

        Operation operation1 = getOperator("+");
        operation1.execute(numbers);

        Operation operation2 = getOperator("-");
        operation2.execute(numbers);

        Operation operation3 = getOperator("*");
        operation3.execute(numbers);

    }

    public static Operation getOperator(String operator) {
        switch (operator) {
            case "+":
                return new Add();
            case "-":
                return new Subtract();
            case "*":
                return new Multiply();
        }
        return null;
    }
}
