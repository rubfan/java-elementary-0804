package Lesson9;
/*
3) Создайте несколько классов геометрических фигур с инстанс методами:
        - getArea (расчет площади)
        - getPerimeter (расчет периметра)
 */

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
