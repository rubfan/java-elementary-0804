public class Main {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumPerimeter = 0;

        Figure figures[] = new Figure[5];
        figures[0] = new Square(6, 6);
        figures[1] = new RightTriangle(4, 5);
        figures[2] = new Rectangle(5, 8);
        figures[3] = new Square(11, 11);
        figures[4] = new Rectangle(3, 7);

        for (int i = 0; i < figures.length; i++) {
            sumArea += figures[i].getArea();
            sumPerimeter += figures[i].getPerimeter();
        }
        System.out.println("Sum of all figures area: " + sumArea);
        System.out.println("Sum of all figures perimeter: " + sumPerimeter);
    }
}
