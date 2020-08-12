package interpreter;

public class Add implements Operation {
    public void execute(Numbers numbers) {
        int result = numbers.getA() + numbers.getB();
        System.out.println("Add: " + result);
    }
}
