package Task3;

public class Hexagon extends Shapes {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2) * 3 * Math.pow(3, 0.5) / 2;
    }

    public double getPerimeter() {
        return side * 6;
    }
}
