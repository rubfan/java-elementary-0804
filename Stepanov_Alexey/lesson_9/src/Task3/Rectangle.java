package Task3;

public class Rectangle extends Shapes {
    private int sideA;
    private int sideB;

    public void setSides(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }
}
