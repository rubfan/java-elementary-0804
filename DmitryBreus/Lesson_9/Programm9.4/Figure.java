public class Figure {
    public static final int Radius = 2;
    public static final int RegnangleA = 5;
    public static final int RegnangleB = 4;
    public static final int TriangleA = 6;
    public static final int TriangleB = 4;
    public static final int TriangleC = 7;
    public static final int SquareA = 25;
    public static final int Rhombusd1 = 10;
    public static final int Rhombusd2 = 6;
    static double TotalArea = 0, TotalPer = 0;
    public static void main(String[] args) {
        Circle crcl = new Circle();
        Rectangle rctgl = new Rectangle();
        Rhombus rmb = new Rhombus();
        Square sqr = new Square();
        Triangle trgl = new Triangle();
        System.out.println("Создан массив фигур");
        double[] areaFig = new double[]{
                crcl.getArea(Radius),
                rctgl.getArea(RegnangleA, RegnangleB),
                rmb.getArea(Rhombusd1, Rhombusd2),
                sqr.getArea(SquareA),
                trgl.getArea(TriangleA, TriangleB, TriangleC)
        };
        double[] perFig = new double[]{
                crcl.getPerimeter(Radius),
                rctgl.getPerimeter(RegnangleA, RegnangleB),
                rmb.getPerimeter(Rhombusd1, Rhombusd2),
                sqr.getPerimeter(SquareA),
                trgl.getPerimeter(TriangleA, TriangleB, TriangleC)
        };
        System.out.println("Площядь       Периметр");
        for (int i = 0; i <= areaFig.length - 1; i++) {
            System.out.println((float) areaFig[i] + "       " + (float) perFig[i]);
            TotalArea = TotalArea + areaFig[i];
            TotalPer = TotalPer + perFig[i];
        }
        System.out.println("Общ Площядь      Общ Периметр");
        System.out.println((float) TotalArea + "       " + (float) TotalPer);
    }
}
