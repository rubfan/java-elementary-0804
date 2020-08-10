package Lamp;

public class Batteries {
    private int batteries;
    private boolean isWorking;

    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }

    public void showSetBattery() {
        switch (batteries) {
            case 3:
                System.out.println("Shine white");
            case 2:
                System.out.println("Shine red");
            case 1:
                System.out.println("Blink");
                isWorking = true;
                break;
            default:
                System.out.println("Error! Check out batteries.");
                isWorking = false;
        }
    }

    public void showIsWorking() {
        if (isWorking) {
            System.out.println("Working");
        } else {
            System.out.println("Not-working");
        }
    }
}
