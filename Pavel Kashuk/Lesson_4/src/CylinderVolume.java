// 6) Написать программу которая на вход метода main получает 2 числа из командной строки,
// 1е число это высота 2е радиус цилиндра, вывести на экран обьем цилиндра. (тспользуйте константу Math.PI)

public class CylinderVolume {
    public static void main(String[] args) {
        double h = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double v = Math.PI * Math.pow(r,2) * h;
        System.out.println("Cylinder height is: " + h);
        System.out.println("Cylinder radius is: " + r);
        System.out.println("Cylinder volume is: " + v);
    }
}