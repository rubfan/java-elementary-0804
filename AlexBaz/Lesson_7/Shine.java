public class Shine {
    private int battery;

    public void colorLight(int itemBattery) {
        battery = itemBattery;
        System.out.println(battery + " batteries inserted");
        if (battery > NumberOfBatteries.maxBatteries) {
            System.out.println("Max size battery = " + NumberOfBatteries.maxBatteries + "/n" + "You need to select a quantity from 1 to " + NumberOfBatteries.maxBatteries);
        } else {
            System.out.println("The following light modes are available:");
            if (battery == 1) {
                System.out.println("Red and fleshing light mode unavailable, add battery");
                wighteLight();
            }

            if (battery == 2) {
                System.out.println("Fleshing light mode unavailable, add battery");
                wighteLight();
                redLight();
            }
            if (battery >= 3) {
                wighteLight();
                redLight();
                flashingLight();
            }
        }
    }

    private void flashingLight() {
        System.out.println("White flashing mode");
    }

    private void redLight() {
        System.out.println("White red mode");
    }

    private void wighteLight() {
        System.out.println("White light mode");
    }
}
