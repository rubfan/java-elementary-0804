public class TaskSeven {
    public static void main(String[] args) {

        int days = Integer.parseInt(args[0]);
        int dayPrice = 40;
        int discount = 0;

        if (days > 5) {
            discount = 20;
        }

        if (days > 7) {
            discount = 50;
        }

        int price = dayPrice * days - discount;

        System.out.println(price + " uah.");
    }
}
