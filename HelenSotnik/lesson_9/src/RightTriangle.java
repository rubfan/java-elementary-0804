public class RightTriangle extends Figure {

    public RightTriangle(double s1, double s2) {
        super(s1, s2);
    }

    public RightTriangle(RightTriangle ob) {
        super(ob);
    }

    public double getArea() {
        return getSide1() * getSide2() / 2;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(getSide1() * getSide1() + getSide2() * getSide2());
        return getSide1() + getSide2() + hypotenuse;
    }
}
