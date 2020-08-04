package bridge;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(new Red()));
        shapes.add(new Triangle(new Green()));
        shapes.add(new Circle(new Blue()));

        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }
}
