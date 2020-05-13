public class FlashlightProperties {
    private final String RED = "RED LIGHT";
    private final String WHITE = "WHITE LIGHT";
    private final String FLASHING = "FLASHING LIGHT";

    private String name;
    private int batteries;
    private String glow;
    private String colour;
    private float price;
    private String manufacturer;

    public void putOnBatteries(int numberOfBatteries) {
        batteries = numberOfBatteries;
    }

    public void whichGlow() {
        switch (batteries) {
            case 1:
                glow = WHITE;
                break;
            case 2:
                glow = RED;
                break;
            case 3:
                glow = FLASHING;
                break;
            default:
                glow = "Not working. For start, put on 1,2 or 3 batteries, please.";
        }
        System.out.println("Flashlight glow: " + glow);
    }

    public void setName(String flashlightName) {
        name = flashlightName;
    }

    public String getName() {
        return name;
    }

    public void setManufacturer(String flashlightManufacturer) {
        manufacturer = flashlightManufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setColour(String flashlightColour) {
        colour = flashlightColour;
    }

    public String getColour() {
        return colour;
    }

    public void setPrice(float flashlightPrice) {
        price = flashlightPrice;
    }

    public float getPrice() {
        return price;
    }

}
