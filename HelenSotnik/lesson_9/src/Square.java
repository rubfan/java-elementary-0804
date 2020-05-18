public class Square extends Figure {

    public Square(double s1, double s2) {
        super(s1, s2);
    }

    public Square(Square ob) {
        super(ob);
    }

    public double getArea() {
        return getSide1() * getSide2();
    }

    public double getPerimeter() {
        return 4 * getSide1();
    }
}
