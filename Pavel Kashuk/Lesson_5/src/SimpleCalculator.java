// 5) Создайте калькулятор, который выполняет, базовые арифметические операции и выводит на экран результат:
// - умножение;
// - деление;
// - сложение;
// - вычитание;
// - остаток от деления (%);
// - нахождение модуля числа (можно использовать Math.abs)
// входные данные здесь можно представить как параметры из командной строки или из "Run Configuration". Формат ввода примерно такой:
// 123 + 123
// 33 * 45
// 11 / 31

public class SimpleCalculator {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        if (args[1].equals("abc")) {
            System.out.println(Math.abs(a));
        } else {
            String mathOperation = args[1];
            Double b = Double.parseDouble(args[2]);
            if (mathOperation.equals("+")) {
                System.out.printf("%s + %s = %s",a ,b ,a + b);
            } else if (mathOperation.equals("-")) {
                System.out.printf("%s - %s = %s",a ,b ,a - b);
            } else if (mathOperation.equals("*")) {
                System.out.printf("%s * %s = %s",a ,b ,a * b);
            } else if (mathOperation.equals("/") && b != 0) {
                System.out.printf("%s / %s = %s",a ,b ,a / b);
            } else if (mathOperation.equals("%") && b != 0) {
                System.out.println(a + " % " + b + " = " + a % b);
            } else {
                System.out.println("Error! Dividing by zero is not allowed.");
            }
        }
    }
}