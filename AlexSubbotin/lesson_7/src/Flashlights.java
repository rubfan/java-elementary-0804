public class Flashlights {
    public FlashlightsProperties properties = new FlashlightsProperties();

    public static void main(String[] args) {
        Flashlights firstFlashlight = new Flashlights();
        firstFlashlight.properties.setName("BIG");
        firstFlashlight.properties.setColour("Silver");
        firstFlashlight.properties.setManufacturer("Big Corp.");
        firstFlashlight.properties.setPrice(15.5f);
        firstFlashlight.properties.putOnBatteries(Integer.parseInt(args[0]));

        printFlashlight(firstFlashlight);
    }

    private static void printFlashlight(Flashlights flashlight) {
        System.out.println("Flashlight name: " + flashlight.properties.getName());
        System.out.println("Flashlight manufacturer: " + flashlight.properties.getManufacturer());
        System.out.println("Flashlight colour: " + flashlight.properties.getColour());
        System.out.println("Flashlight price: " + flashlight.properties.getPrice() + "$");
        flashlight.properties.whichGlow();
    }

}
