import java.util.Scanner;

public class Gearboxes {
    GearboxesProperties properties = new GearboxesProperties();
    GearboxesOperation operation = new GearboxesOperation();

    public static void main(String[] args) {
        Gearboxes firstGearbox = new Gearboxes();
        firstGearbox.properties.setGearboxesCountry("Japan");
        firstGearbox.properties.setGearboxesManufacturer("Jatco");
        firstGearbox.properties.setGearboxesName("J1039I");
        firstGearbox.properties.setTypeAutomatic(false);
        firstGearbox.operation.setNumberOfGears((byte) 4);
        firstGearbox.operation.setSpeedStep((byte) 26);

        gearboxResult(firstGearbox);

        Gearboxes secondGearbox = new Gearboxes();
        secondGearbox.properties.setGearboxesCountry("Germany");
        secondGearbox.properties.setGearboxesManufacturer("ZF Friedrichshafen AG");
        secondGearbox.properties.setGearboxesName("MS Tronic");
        secondGearbox.properties.setTypeAutomatic(true);
        secondGearbox.operation.setNumberOfGears((byte) 4);
        secondGearbox.operation.setSpeedStep((byte) 35);

        gearboxResult(secondGearbox);

    }

    private static void gearboxResult(Gearboxes gearbox) {
        System.out.println("Gearbox name: " + gearbox.properties.getGearboxName());
        System.out.println("Gearbox manufacturer: " + gearbox.properties.getGearboxManufacturer());
        System.out.println("Gearbox country: " + gearbox.properties.getGearboxesCountry());
        gearbox.properties.type(gearbox.properties.isGearboxType()); //Print gearbox type.
        System.out.println("To determine the maximum speed, enter the gear number: ");
        Scanner scanner = new Scanner(System.in);
        byte gearNumber = scanner.nextByte();
        gearbox.operation.setGearNumber(gearNumber);
        byte speedStep = gearbox.operation.getSpeedStep();
        gearbox.operation.maxSpeedOnGear(gearNumber, speedStep, gearbox.properties.isGearboxType());
    }
}
