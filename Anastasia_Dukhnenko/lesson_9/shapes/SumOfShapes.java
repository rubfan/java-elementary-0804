package shapes;
import shapes.Triangle;
import shapes.Circle;
import shapes.Square;

public class SumOfShapes extends Shapes {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Triangle(2, 4, 3);
        shapes[1] = new Circle(5);
        shapes[2] = new Square(7);
        float sumOfArea = 0;
        float sumOfPerimeter = 0;
        for (int x = 0; x < shapes.length; x++) {
            sumOfArea += shapes[x].getArea();
            sumOfPerimeter += shapes[x].getPerimeter();
        }
        System.out.println("Sum of area: " + sumOfArea);
        System.out.println("Sum of perimeter: " + sumOfPerimeter);
    }
}
