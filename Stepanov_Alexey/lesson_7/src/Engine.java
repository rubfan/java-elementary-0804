public class Engine {
    private String modelName;
    private double fuelLevel;
    private int horsePower;
    private int cylindersNumber;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String name) {
        modelName = name;
    }

    public String getFuelLevel() {
        if (fuelLevel > 1) {
            return fuelLevel * 100 + "% is too much";
        } else {
            return fuelLevel * 100 + "%";
        }
    }

    public void setFuelLevel(double fuel) {
        fuelLevel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int power) {
        horsePower = power;
    }

    public String getCylindersNumber() {
        if (cylindersNumber > 0 && cylindersNumber < 16) {
            return "Cylinder count: " + cylindersNumber;
        } else {
            return "Cylinder count: " + cylindersNumber + " is wrong. Change to range of 1 to 16.";
        }

    }

    public void setCylindersNumber(int cylinders) {
        cylindersNumber = cylinders;
    }

    public String getUsage() {
        if (horsePower < 50) {
            return "Motorbike";
        } else if (horsePower < 500) {
            return "Car";
        } else if (horsePower < 2000) {
            return "Train";
        } else {
            return "Plain";
        }
    }

    public void printEngineData() {
        System.out.println("Engine name: " + getModelName());
        System.out.println("Engine power: " + getHorsePower() + " and " + getCylindersNumber());
        System.out.println("Fuel level: " + getFuelLevel());
        System.out.println("Can be used in: " + getUsage());
    }
}
