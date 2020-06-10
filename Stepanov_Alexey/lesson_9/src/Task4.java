import Task3.*;

public class Task4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Hexagon hexagon = new Hexagon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        circle.setRadius(10);
        hexagon.setSide(10);
        rectangle.setSides(8, 7);
        triangle.setSides(5, 8, 11);
        square.setSide(10);

        Object[] array = new Object[]{circle, hexagon, rectangle, square, triangle};

        double totalShapesArea = 0;
        double totalShapesPerimeter = 0;
        for (Object shape : array) {
            totalShapesArea += ((Shapes) shape).getArea();
            totalShapesPerimeter += ((Shapes) shape).getPerimeter();
        }
        System.out.println("All shapes area: " + totalShapesArea);
        System.out.println("All Shapes perimeter: " + totalShapesPerimeter);
    }
}
