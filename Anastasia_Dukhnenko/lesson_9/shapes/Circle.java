package shapes;

public class Circle extends Shapes {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    public float getArea() {
        float area = (float) (Math.PI * radius * radius);
        return area;
    }
    public float getPerimeter() {
        float perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }
}
