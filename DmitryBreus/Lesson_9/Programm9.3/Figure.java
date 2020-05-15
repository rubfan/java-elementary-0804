import java.util.Scanner;
public class Figure {
    public static void main(String[] args) {
        System.out.println("Введите номер фигуры");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number) {
            case 0: {
                System.out.println("Выбран 0. Круг. Введите радиус ");
                int R = in.nextInt();
                Circle crcl = new Circle();
                System.out.println("Площадь: " + crcl.getArea(R));
                System.out.println("Периметр: " + crcl.getPerimeter(R));
            }
            break;
            case 1: {
                System.out.println("Выбран 1. Прямоугольник. Введите сторону a");
                int a = in.nextInt();
                System.out.println("Введите сторону b");
                int b = in.nextInt();
                Rectangle rctgl = new Rectangle();
                System.out.println("Площадь: " + rctgl.getArea(a, b));
                System.out.println("Периметр: " + rctgl.getPerimeter(a, b));
            }
            break;
            case 2: {
                System.out.println("Выбран 2. Ромб. Введите диагональ d1");
                int d1 = in.nextInt();
                System.out.println("Введите диагональ d2");
                int d2 = in.nextInt();
                Rhombus rmb = new Rhombus();
                System.out.println("Площадь: " + rmb.getArea(d1, d2));
                System.out.println("Периметр: " + rmb.getPerimeter(d1, d2));
            }
            break;
            case 3: {
                System.out.println("Выбран 3. Квадрат. Введите сторону a");
                int a = in.nextInt();
                Square sqr = new Square();
                System.out.println("Площадь: " + sqr.getArea(a));
                System.out.println("Периметр: " + sqr.getPerimeter(a));
            }
            break;
            case 4: {
                System.out.println("Выбран 4. Треугольник. Введите сторону a");
                int a = in.nextInt();
                System.out.println("Введите сторону b");
                int b = in.nextInt();
                System.out.println("Введите сторону c");
                int c = in.nextInt();
                Triangle trgl = new Triangle();
                System.out.println("Площадь: " + trgl.getArea(a, b, c));
                System.out.println("Периметр: " + trgl.getPerimeter(a, b, c));
            }
            break;
        }
    }
}
