public class Square {

    public double getArea(double side) {
        double area = side * side;
        System.out.println("Area of square = " + area);
        return area;
    }

    public double getPerimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of square = " + perimeter);
        return perimeter;
    }
}
