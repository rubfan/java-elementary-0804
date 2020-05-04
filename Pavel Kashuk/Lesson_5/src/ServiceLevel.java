// 6) Задача "Чаевые".
// входные данные(также как и в предыдущей задаче): сумма, которую вы должны заплатить и уровень сервиса
// в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
// - terrible (0%)
// - poor (5%)
// - good (10%)
// - great (15%)
// - excellent (20%)

public class ServiceLevel {
    public static void main(String[] args) {
        double sum = Double.parseDouble(args[0]);
        String serviceLevel = args[1];
        double tip;
        if (serviceLevel.equals("terrible")) {
            tip = 0.0;
            System.out.println("Amount order is: " + sum + " ,amount tip is: " + tip);
            System.out.println("Total amount is: " + (sum + tip));
        }
        else if (serviceLevel.equals("poor")) {
            tip = sum / 100 * 5;
            System.out.println("Amount order is: " + sum + " ,amount tip is: " + tip);
            System.out.println("Total amount is: " + (sum + tip));
        }
        else if (serviceLevel.equals("good")) {
            tip = sum / 100 * 10;
            System.out.println("Amount order is: " + sum + " ,amount tip is: " + tip);
            System.out.println("Total amount is: " + (sum + tip));
        }
        else if (serviceLevel.equals("great")) {
            tip = sum / 100 * 15;
            System.out.println("Amount order is: " + sum + " ,amount tip is: " + tip);
            System.out.println("Total amount is: " + (sum + tip));
        }
        else if (serviceLevel.equals("excellent")) {
            tip = sum / 100 * 20;
            System.out.println("Amount order is: " + sum + " ,amount tip is: " + tip);
            System.out.println("Total amount is: " + (sum + tip));
        }
        else {
            System.out.println("Please, rate the level of service!");
            System.out.println("Write: terrible, poor, good, great or excellent.");
        }
    }
}