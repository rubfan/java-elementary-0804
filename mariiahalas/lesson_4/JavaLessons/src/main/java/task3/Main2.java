package task3;

import static java.lang.Integer.toBinaryString;

public class Main2 {
    public static void main(String[] args) {
        double power = Double.parseDouble(args[6]);
        double num = Double.parseDouble(args[5]);
        int sysCount = Integer.parseInt(args[7]);
        int number = (int)Math.pow(num,power);
        System.out.println(Integer.toString(number, sysCount));;
     }
}
