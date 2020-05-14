public class NumberOfBatteries {
    protected static int maxBatteries = 1;

    public void maxPowerBank(int itemBattery) {
        maxBatteries = itemBattery;
        System.out.println("Maximum battery capacity = " + maxBatteries);
        if (maxBatteries < 3) {
            System.out.println("Increase the maximum battery storage for a smooth functioning lamp, the optimal number of 3");
        }
    }
}
