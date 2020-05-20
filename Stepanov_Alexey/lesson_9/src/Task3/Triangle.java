package Task3;

public class Triangle extends Shapes {
    private int sideA;
    private int sideB;
    private int sideC;

    public void setSides(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.pow(p * (p - sideA) * (p - sideB) * (p - sideC), 0.5);
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
