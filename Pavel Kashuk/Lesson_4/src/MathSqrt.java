// 4) Написать программу которая на вход метода main получает 2 числа из командной строки
// пускай эти числа будут катетами в прямом треугольнике - выведите на экран длину гипотенузы(длину 3й стороны треугольника).
// (используйте метод библиотеки Math.sqrt())

public class MathSqrt {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double hypotenuse = Math.sqrt(Math.pow(a,2) + (Math.pow(a,2)));
        System.out.println("First side is: " + a);
        System.out.println("Second side is: " + b);
        System.out.println("Hypotenuse is: " + hypotenuse);
    }
}