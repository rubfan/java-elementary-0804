class Triangle extends Shape {
    private float lengthOfSideA;
    private float lengthOfSideB;
    private float lengthOfSideC;

    public Triangle(float lengthOfSideA, float lengthOfSideB, float lengthOfSideC) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.lengthOfSideC = lengthOfSideC;
    }

    public double getArea() {
        float p = (lengthOfSideA + lengthOfSideB + lengthOfSideC) / 2;
        float area = (float) Math.sqrt(p * (p - lengthOfSideA) * (p - lengthOfSideB) * (p - lengthOfSideC));
        return area;
    }

    public double getPerimeter() {
        float perimetr = (lengthOfSideA + lengthOfSideB + lengthOfSideC);
        return perimetr;
    }
}