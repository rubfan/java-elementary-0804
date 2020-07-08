package Lesson9;
/*
3) Создайте несколько классов геометрических фигур с инстанс методами:
        - getArea (расчет площади)
        - getPerimeter (расчет периметра)
 */

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }
}
