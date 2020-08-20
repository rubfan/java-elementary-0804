package solidPrinciples.openClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(20);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.areaCalc(rect, circle));
    }
}
