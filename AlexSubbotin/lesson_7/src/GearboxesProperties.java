public class GearboxesProperties {
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

    public void setGearboxesName(String gearboxName) {
        name = gearboxName;
    }

    public String getGearboxName() {
        return name;
    }

    public void setGearboxesManufacturer(String gearboxManufacturer) {
        manufacturer = gearboxManufacturer;
    }

    public String getGearboxManufacturer() {
        return manufacturer;
    }

    public void setGearboxesCountry(String gearboxCountry) {
        country = gearboxCountry;
    }

    public String getGearboxesCountry() {
        return country;
    }

    public void setTypeAutomatic(boolean gearboxType) {
        typeAutomatic = gearboxType;
    }

    public boolean isGearboxType() {
        return typeAutomatic;
    }
}
