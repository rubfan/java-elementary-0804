package main.company;

public class Batteries {
    private int battery;

    public void insert(int numberOfBatteries) {
        battery = numberOfBatteries;
        System.out.println("Quantity of inserted batteries: " + battery);
    }

    public void lightMode() {
        switch (battery) {
            case 1:
                System.out.println("White color mode is available.");
                break;
            case 2:
                System.out.println("Red and white color mode is available");
                break;
            case 3:
                System.out.println("Blinking, white and red color mode is available");
                break;
            default:
                System.out.println("Wrong number of batteries, insert from 1 to 3 batteries");
                break;
        }
    }

    public void chargeLevelIndicator() {
        switch (battery) {
            case 1:
                System.out.println("Indicator is red. Low charge level");
                break;
            case 2:
                System.out.println("Indicator is yellow. Medium charge level");
                break;
            case 3:
                System.out.println("Indicator is green. Flashlight is full charged");
                break;
            default:
                System.out.println("Insert charged batteries from 1 to 3 to use flashlight");
                break;
        }
    }
}

