class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        float area = (float) Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        float perimetr = (float) Math.PI * radius * 2;
        return perimetr;
    }


}
