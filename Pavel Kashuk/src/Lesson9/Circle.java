package Lesson9;
/*
3) Создайте несколько классов геометрических фигур с инстанс методами:
        - getArea (расчет площади)
        - getPerimeter (расчет периметра)
 */

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
