// 7) Написать программу которая на вход метода main получает 1 число из командной строки,
// это число означает количество человек. Выведите на экран сколько понадобится бутылок шампанского обьемом 750 мл
// чтобы разлить по бокалам 100 мл напитка каждому и сколько останется недоразлитого шампанского.

public class ChampagneBottles {
    public static void main(String[] args) {
        int peopleAmount = Integer.parseInt(args[0]);
        double bottleV = 750;
        double onePerson = 100;
        int bottlesAmount = (int) Math.ceil((peopleAmount * onePerson) / bottleV);
        int remain = (int) ((bottlesAmount * bottleV) - (onePerson * peopleAmount));
        System.out.println(peopleAmount + " people need " + bottlesAmount + " bottles(s)");
        System.out.println(peopleAmount == 0 ? "Bottle if full" : remain + " ml will remain");
    }
}