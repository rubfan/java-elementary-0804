public class Square {

    public double getAreaSquare(double side) {
        double area = side * side;
        System.out.println("Area of square = " + area);
        return area;
    }

    public double getPerimeterSquare(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of square = " + perimeter);
        return perimeter;
    }
}
