public class tips {
    public static void main(String[] args) {
        /*
6) Задача "Чаевые".
входные данные(также как и в предыдущей задаче): сумма, которую вы должны заплатить и уровень сервиса
в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
- terrible (0%)
- poor (5%)
- good (10%)
- great (15%)
- excellent (20%)
         */
        double checkSum = Double.parseDouble(args[0]);
        String serviceLevel = args[1];
        checkSum += checkSum * tipsPercent(serviceLevel);
        System.out.println(Math.round(checkSum));
    }

    public static float tipsPercent(String serviceLevel) {
        float tipsPercent;
        if (serviceLevel.equals("poor")) {
            tipsPercent = 0.05f;
        } else if (serviceLevel.equals("good")) {
            tipsPercent = 0.1f;
        } else if (serviceLevel.equals("great")) {
            tipsPercent = 0.15f;
        } else if (serviceLevel.equals("excellent")) {
            tipsPercent = 0.2f;
        } else {
            tipsPercent = 0; //terrible level and other bed levels.
        }
        return tipsPercent;
    }
}
