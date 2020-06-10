public class Little_Red_Riding_Hood {
    private int a;
    public void carryPies(int amount) {
        a = amount;
        String pies = null;
        if (amount == 1) {
            pies = "пирожком.";
        } else if (amount < 20 && amount > 1) {
            pies = "пирожками.";
        } else if (amount >= 20) {
            pies = "большим количеством пирожков!";
        } else if (amount < 1) {
            System.out.println("ничем :)");
        }
        System.out.println("Красная Шапочка несёт корзинку с " + amount + " " + pies);
    }
    public void knockOnTheDoor() {
        System.out.println("Красная Шапочка стучится в дверь.");
    }
}
