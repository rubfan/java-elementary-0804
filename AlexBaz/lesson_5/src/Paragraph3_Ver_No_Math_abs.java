public class Paragraph3_Ver_No_Math_abs {
    public static void main(String[] args) {
        Float a = Float.parseFloat(args[0]);
        Float b = Float.parseFloat(args[1]);
        Float a1, b1;
        if (a >= 10) {
            a1 = a - 10;
        } else if (a < 10 && a >= 0) {
            a1 = 10 - a;
        } else {
            a1 = a * (-1) + 10;
        }

        if (b >= 10) {
            b1 = b - 10;
        } else if (b < 10 && b >= 0) {
            b1 = 10 - b;
        } else {
            b1 = b * (-1) + 10;
        }

        if (a1 > b1) {
            System.out.println("Число " + b + " ближе к 10");
        }   else if (b1 > a1) {
                System.out.println("Число " + a + " ближе к 10");
        }       else  {
                    System.out.println("Числа " + a + " и " + b + " одинкаво близкие к 10");
        }
    }
}

