public class GasTank {
    private int fuel;

    public void amountOfFuel(int amountF) {
        fuel = amountF;
    }

    public boolean fullTank() {
        if (fuel >= 30) {
            return true;
        } else {
            System.out.println("I need more fuel");
        }
        return false;
    }
}
