package Task3;

public class Square extends Shapes {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }
}
