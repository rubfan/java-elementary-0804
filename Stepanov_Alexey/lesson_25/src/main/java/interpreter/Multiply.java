package interpreter;

public class Multiply implements Operation {
    public void execute(Numbers numbers) {
        int result = numbers.getA() * numbers.getB();
        System.out.println("Multiply: " + result);
    }
}
