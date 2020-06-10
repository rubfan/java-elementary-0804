public class Champagne {
    public static void main(String[] params) {
        int number = Integer.parseInt(params[0]);
        int bottles = 100 * number % 750 != 0 ? (100 * number / 750 + 1) : (100 * number / 750);
        int rest = bottles * 750 - 100 * number;
        System.out.println("Для " + number + " человек нужно " + bottles + " бут. шампанского. Останется " + rest + " мл.");
    }
}
