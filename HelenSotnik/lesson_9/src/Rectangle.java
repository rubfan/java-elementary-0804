public class Rectangle extends Figure {

    public Rectangle(double s1, double s2) {
        super(s1, s2);
    }

    public Rectangle(Figure ob) {
        super(ob);
    }

    public double getArea() {
        return getSide1() * getSide2();
    }

    public double getPerimeter() {
        return 2 * (getSide1() + getSide2());
    }
}
