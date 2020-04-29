public class Paragraph7 {
    public static void main(String[] args) {
        int prise = 40;
        int day = Integer.parseInt(args[0]);
        if (day > 0 && day <= 5) {
            System.out.println("Аренда квартиры за " + day + "дней = " + day*prise + " грн.");
        }
        if (day > 5 && day < 8) {
            System.out.println("Аренда квартиры за " + day + "дней = " + (day * prise - 20) + " грн.");
        }
        if (day > 0 && day > 7) {
            System.out.println("Аренда квартиры за " + day + "дней = " + (day * prise - 50) + " грн.");
        }
    }
}
