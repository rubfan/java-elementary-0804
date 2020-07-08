public class Triangle {

    public double getAreaTriangle(double sideA, double sideB) {
        double area = 0.5 * (sideA * sideB);
        System.out.println("Area of triangle = " + area);
        return area;
    }

    public double getPerimeterTriangle(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of triangle = " + perimeter);
        return perimeter;
    }
}
