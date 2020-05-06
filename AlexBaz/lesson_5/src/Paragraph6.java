public class Paragraph6 {
    public static void main(String[] args) {
        double price = Double.parseDouble(args[0]);
        String servis = args[1];

        if (servis.equals("terrible")) {
            System.out.println("Чаевые составят " + "0.00" + " грн.");
        }
        if (servis.equals("poor")) {
            System.out.println("Чаевые составят " + price*0.05 + " грн.");
        }
        if (servis.equals("good")) {
            System.out.println("Чаевые составят " + price*0.1 + " грн.");
        }
        if (servis.equals("great")) {
            System.out.println("Чаевые составят " + price*0.15 + " грн.");
        }
        if (servis.equals("excellent")) {
            System.out.println("Чаевые составят " + price*0.2 + " грн.");
        }
    }
}
