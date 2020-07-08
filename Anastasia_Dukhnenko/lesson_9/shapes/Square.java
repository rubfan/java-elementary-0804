package shapes;

public class Square extends Shapes {
    private float side;

    public Square(float side) {
        this.side = side;
    }
    public float getArea() {
        float area = side * side;
        return area;
    }
    public float getPerimeter() {
        float perimeter = 4 * side;
        return perimeter;
    }
}
