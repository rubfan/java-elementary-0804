public class HomeWork9Task3 {
    public static void main(String[] args) {
        Triangle t = new Triangle() {
        };
        double ta = t.getAreaTriangle(12.8, 15);
        double tp = t.getPerimeterTriangle(12, 15, 18);
        Rhomb r = new Rhomb() {
        };
        double ra = r.getAreaRhomb(15.41, 11);
        double rp = r.getPerimeterRhomb(14);
        Square s = new Square() {
        };
        double sa = s.getAreaSquare(12.7);
        double sp = s.getPerimeterSquare(11.3);
        calcSumAreasPer(sa, sp, ra, rp, ta, tp);
    }

    private static void calcSumAreasPer(double sa, double sp, double ra, double rp, double ta, double tp) {
        double[] arrPerFig = {sa, sp, ra, rp, ta, tp};
        double result = 0;
        for (double res : arrPerFig) {
            result = result + res;
        }

        System.out.println("Sum of area & perimeter all figures " + result);
    }

}





