public class HomeWork_9_3 {
    public static void main(String[] args) {
        Triangle t = new Triangle() {
        };
        Rhomb r = new Rhomb() {
        };
        Square s = new Square() {
        };
        double[] arPerFig = {s.getArea(12.7), s.getPerimeter(11.3), r.getArea(15.41, 11),
                r.getPerimeter(14), t.getArea(12.8, 15), t.getPerimeter(12, 15, 18)};
        double result = 0;
        for (double res : arPerFig) {
            result = result + res;
        }

        System.out.println("Sum of area & perimeter all figures " + result);
    }


}


