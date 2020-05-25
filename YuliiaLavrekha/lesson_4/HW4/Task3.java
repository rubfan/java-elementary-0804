package HW4;

public class Task3 {
    public static void main(String[] args) {
        double i = Double.parseDouble(args[0]);
        double ii = Double.parseDouble(args[1]);
        int iii = Integer.parseInt(args[2]);
        double result = Math.pow(i, ii);
        String bin = Integer.toBinaryString((int) result);
        System.out.println(iii == 2 ? bin : result);
    }
}
