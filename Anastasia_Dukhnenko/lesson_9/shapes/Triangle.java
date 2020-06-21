package shapes;

public class Triangle extends Shapes {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public float getArea() {
        float p = (sideA + sideB + sideC) / 2;
        float area = (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }
    public float getPerimeter() {
        float perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
