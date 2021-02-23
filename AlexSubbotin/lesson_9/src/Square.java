public class Square extends Figures {
    private double firstSide;


    public void setFirstSide (double firstSide) {
        this.firstSide = firstSide;
    }

    public double getPerimeter () {
        double perimeter = this.firstSide * 4;
        return perimeter;
    }

    public double getArea () {
        double area = Math.pow(this.firstSide, 2);
        return area;
    }
}

