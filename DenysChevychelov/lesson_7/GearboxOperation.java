public class GearboxOperation {
    GearboxProperties properties = new GearboxProperties();

    private byte numberOfGears;
    private byte speedStep;
    private byte gearNumber;

    public void maxSpeedOnGear(byte gearNumber, byte speedStep, boolean gearboxType) {
        if (gearboxType) {
            speedStep -= 5;
        }
        int speed;
        switch (gearNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                speed = gearNumber * speedStep;
                System.out.println("Maximum speed in " + gearNumber + " gear " + speed + " km/h.");
                break;
            default:
                System.out.println("Enter a correct gear number.");
        }
    }

    public void setNumberOfGears(byte numberGears) {
        numberOfGears = numberGears;
    }

    public byte getNumberOfGears() {
        return numberOfGears;
    }

    public void setSpeedStep(byte gearboxSpeedStep) {
        speedStep = gearboxSpeedStep;
    }

    public byte getSpeedStep() {
        return speedStep;
    }

    public void setGearNumber(byte setGearNumber) {
        gearNumber = setGearNumber;
    }

    public byte getGearNumber() {
        return gearNumber;
    }
}