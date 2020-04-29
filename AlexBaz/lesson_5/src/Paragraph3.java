public class Paragraph3 {
    public static void main(String[] args) {
        Float a = Float.parseFloat(args[0]);
        Float b = Float.parseFloat(args[1]);
        a = Math.abs(a - 10);
        b = Math.abs(b - 10);
        if (a > b) {
            System.out.println("Число " + b + " ближе к 10");
        }   else if (a < b){
                System.out.println("Число " + a + " ближе к 10");
        }       else  {
            System.out.println("Числа " + a + " и " + b + " одинкаво близкие к 10");
        }


    }
}
