public class GearboxProperties {
    private String name;
    private String manufacturer;
    private String country;
    private boolean typeAutomatic;

    public void type(boolean typeAutomatic) {
        if (typeAutomatic) {
            System.out.println("Automatic gearbox.");
        } else {
            System.out.println("Mechanic gearbox.");
        }
    }

    public void setGearboxName(String gearboxName) {
        name = gearboxName;
    }

    public String getGearboxName() {
        return name;
    }

    public void setGearboxManufacturer(String gearboxManufacturer) {
        manufacturer = gearboxManufacturer;
    }

    public String getGearboxManufacturer() {
        return manufacturer;
    }

    public void setGearboxCountry(String gearboxCountry) {
        country = gearboxCountry;
    }

    public String getGearboxCountry() {
        return country;
    }

    public void setTypeAutomatic(boolean gearboxType) {
        typeAutomatic = gearboxType;
    }

    public boolean isGearboxType() {
        return typeAutomatic;
    }
}