public class Trapeze extends Figures {
    private double firstSide;
    private double secondSide;
    private double bottomBase;
    private double upperBase;
    private double height;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        double perimeter = this.firstSide
                + this.secondSide
                + this.bottomBase
                + this.upperBase;
        return perimeter;
    }

    public double getArea() {
        double area = ((this.bottomBase + this.upperBase) / 2) * this.height;
        return area;
    }
}