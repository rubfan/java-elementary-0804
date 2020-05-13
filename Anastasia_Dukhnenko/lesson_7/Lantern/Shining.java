public class Shining {
    private int amountOfBatteries;
    public void shine(int batteries) {
        amountOfBatteries = batteries;
        if (amountOfBatteries == 1) {
            System.out.println("I'm shining white.");
        } else if (amountOfBatteries == 2) {
            System.out.println("I'm shining red.");
        } else if (amountOfBatteries == 3) {
            System.out.println("I'm blinking.");
        }
    }
}
