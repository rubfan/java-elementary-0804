public class Rectangle extends Figures {
    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getPerimeter() {
        double perimeter = (this.firstSide + this.secondSide) * 2;
        return perimeter;
    }

    public double getArea() {
        double area = this.firstSide * this.secondSide;
        return area;
    }
}