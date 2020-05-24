public class Triangle {
    public double getArea(int a, int b, int c) {
        return 0.25*Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c));
    }
    public double getPerimeter(int a, int b, int c) {
         return a+b+c;
    }
}
