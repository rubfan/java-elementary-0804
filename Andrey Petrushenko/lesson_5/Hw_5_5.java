public class Hw_5_5 {
    public static void main(String[] args) {
        float n1 = Float.parseFloat(args[0]);
        String a = args[1];
        float n2 = Float.parseFloat(args[2]);
        if (a.equals("*")){
            System.out.println("Результат умножения = " + (n1*n2));
        }
        else{}
        if (a.equals("/")){
            System.out.println("Результат деления = " + (n1/n2));
        }
        else{}
        if (a.equals("+")){
            System.out.println("Результат сложения = " + (n1+n2));
        }
        else{}
        if (a.equals("-")){
            System.out.println("Результат вычитания = " + (n1-n2));
        }
        else{}
        if (a.equals("%")){
            System.out.println("Остаток от деления = " + (n1%n2));
        }
        else{}
        if (a.equals("m")){
            System.out.println("Модуль числа = " + (Math.abs(n1)));
        }
        else{}
    }
    }

