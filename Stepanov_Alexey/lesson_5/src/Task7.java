public class Task7 {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int discount;
        if (days > 7) {
            discount = 50;
        } else if (days > 5) {
            discount = 20;
        } else {
            discount = 0;
        }
        System.out.println(days * 40 - discount);
    }
}
