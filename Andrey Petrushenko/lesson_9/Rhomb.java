public class Rhomb {

    public double getArea(double side, double height) {
        double area = side * height;
        System.out.println("Area of rhomb = " + area);
        return area;
    }

    public double getPerimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of rhomb = " + perimeter);
        return perimeter;
    }
}
