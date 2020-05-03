public class Task6 {
    public static void main(String[] args) {
        double sum = Double.parseDouble(args[0]);
        String serviceLevel = args[1];
        double tipsSum = 0;
        if (serviceLevel.equals("terrible")) {
            tipsSum = 0;
        }
        if (serviceLevel.equals("poor")) {
            tipsSum = sum / 100 * 5;
        }
        if (serviceLevel.equals("good")) {
            tipsSum = sum / 100 * 10;
        }
        if (serviceLevel.equals("great")) {
            tipsSum = sum / 100 * 15;
        }
        if (serviceLevel.equals("excellent")) {
            tipsSum = sum / 100 * 20;
        }
        System.out.println("Tips: " + tipsSum);
    }
}
