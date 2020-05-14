import java.util.Scanner;

public class Gearbox {
    GearboxProperties properties = new GearboxProperties();
    GearboxOperation operation = new GearboxOperation();

    public static void main(String[] args) {
        Gearbox firstGearbox = new Gearbox();
        firstGearbox.properties.setGearboxCountry("Japan");
        firstGearbox.properties.setGearboxManufacturer("Jatco");
        firstGearbox.properties.setGearboxName("J1039I");
        firstGearbox.properties.setTypeAutomatic(false);
        firstGearbox.operation.setNumberOfGears((byte) 5);
        firstGearbox.operation.setSpeedStep((byte) 30);

        gearboxResult(firstGearbox);

        Gearbox secondGearbox = new Gearbox();
        secondGearbox.properties.setGearboxCountry("Germany");
        secondGearbox.properties.setGearboxManufacturer("ZF Friedrichshafen AG");
        secondGearbox.properties.setGearboxName("MS Tronic");
        secondGearbox.properties.setTypeAutomatic(true);
        secondGearbox.operation.setNumberOfGears((byte) 6);
        secondGearbox.operation.setSpeedStep((byte) 30);

        gearboxResult(secondGearbox);

    }

    private static void gearboxResult(Gearbox gearbox) {
        System.out.println("Gearbox name: " + gearbox.properties.getGearboxName());
        System.out.println("Gearbox manufacturer: " + gearbox.properties.getGearboxManufacturer());
        System.out.println("Gearbox country: " + gearbox.properties.getGearboxCountry());
        gearbox.properties.type(gearbox.properties.isGearboxType()); //Print gearbox type.
        System.out.println("To determine the maximum speed, enter the gear number: ");
        Scanner scanner = new Scanner(System.in);
        byte gearNumber = scanner.nextByte();
        gearbox.operation.setGearNumber(gearNumber);
        byte speedStep = gearbox.operation.getSpeedStep();
        gearbox.operation.maxSpeedOnGear(gearNumber, speedStep, gearbox.properties.isGearboxType());
    }
}