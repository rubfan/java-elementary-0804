// 7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
// что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней,
// он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.

public class ApartmentRent {
    public static void main(String[] args) {
        int daysAmount = Integer.parseInt(args[0]);
        int pricePerDay = 40;
        int discount = 0;
        if (daysAmount > 5) {
            discount = 20;
        }
        if (daysAmount > 7) {
            discount = 50;
        }
        int totalRentSum = daysAmount * pricePerDay - discount;
        System.out.printf("Renting an apartment for %s day(s) is %s uah", daysAmount, totalRentSum);
    }
}