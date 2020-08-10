public class Circle extends Figures {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perimeter = this.radius * 2 * Math.PI;
        return perimeter;
    }

    public double getArea() {
        double area = Math.pow(this.radius, 2) * Math.PI;
        return area;
    }
}