public class Main6 {
    public static void main(String[] params) {
        int days = Integer.parseInt(params [0]);
        int pay = 40;
        if (days < 5) {
            System.out.println("Нужно заплатить: " + (40 * days));
        } else if (days > 5 && days < 8) {
            System.out.println("Нужно заплатить: " + (40 * days - 20));
        } else if (days > 7) {
            System.out.println("Нужно заплатить: " + (40 * days - 50));
        }
    }
}
