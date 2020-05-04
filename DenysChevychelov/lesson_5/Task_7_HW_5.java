class rentApartment {
//    7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее
//    стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней,
//    то скидка составит 50 грн.
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
        System.out.println(price + " грн.");
    }
}
