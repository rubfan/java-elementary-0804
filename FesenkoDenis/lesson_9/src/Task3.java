public class Task3 {
    public static void main(String[] variables) {
        Circle newCircle = new Circle(); // 3 task
        Triangle newTriangle = new Triangle();
        newCircle.diameter = 5;
        newCircle.perimeter();
        newCircle.area();
        newTriangle.side1 = 2;
        newTriangle.side2 = 4;
        newTriangle.side3 = 3;
        newTriangle.height = 2;
        newTriangle.perimeter();
        newTriangle.area();

        Shapes[] arr = {newCircle, newTriangle}; // array for 4 task
        int sumOfPerimeter = 0;

        for (Shapes var : arr) {
            sumOfPerimeter += var.perimeter() + var.area();
        }
        System.out.println("sum " + sumOfPerimeter);
    }
}

abstract class Shapes {
    double side1, side2, side3;
    double height;
    double diameter;
    double perimeter;
    double area;

    abstract double perimeter();

    abstract double area();
}

class Circle extends Shapes {

    double perimeter() {
        perimeter = diameter * Math.PI;
        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }

    double area() {
        area = Math.pow(Math.PI * (diameter / 2), 2);
        System.out.println("area = " + area);
        return area;
    }

}

class Triangle extends Shapes {

    double area() {
        area = (this.side1 * this.height) / 2;
        System.out.println("area = " + area);
        return area;
    }

    double perimeter() {
        perimeter = side1 + side2 + side3;
        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }
}
