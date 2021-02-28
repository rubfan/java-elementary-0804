public class Rhombus extends Figures {
    private double firstSide;

    private double height;


    public void setFirstSide (double firstSide) {
        this.firstSide = firstSide;
    }
    public void setHeight (double height) {
        this.height = height;
    }


    public double getPerimeter () {
        double perimeter = this.firstSide * 4;
        return perimeter;
    }

    public double getArea () {
        double area = this.firstSide * this.height;
        return area;
    }
}
