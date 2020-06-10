class Rectangle extends Shape {
    private float lengthOfSideA;
    private float lengthOfSideB;

    public Rectangle(float lengthOfSideA, float lengthOfSideB) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
    }

    public double getArea() {
        float area = lengthOfSideA * lengthOfSideB;
        return area;
    }

    public double getPerimeter() {
        float perimetr = (lengthOfSideA + lengthOfSideB) * 2;
        return perimetr;
    }
}

