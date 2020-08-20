package interpreter;

public class Subtract implements Operation {
    public void execute(Numbers numbers) {
        int result = numbers.getA() - numbers.getB();
        System.out.println("Subtract: " + result);
    }
}
