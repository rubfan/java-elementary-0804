package HW4;

public class Task5 {
    public static void main(String[] args) {
        double scoreFirst = Double.parseDouble(args[0]);
        double scoreSecond = Double.parseDouble(args[1]);
        double resultFirst = scoreFirst / scoreSecond * 100;
        double resultSecond = scoreSecond / scoreFirst * 100;
        String first = "Team " + args[2] + " is leading by " + resultFirst + "%.";
        String second = "Team " + args[3] + " is leading by " + resultSecond + "%.";
        String out = scoreFirst > scoreSecond ? first : second;
        System.out.println(out);
    }
}
