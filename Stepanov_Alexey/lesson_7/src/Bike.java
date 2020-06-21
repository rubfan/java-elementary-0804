public class Bike {
    private String model;
    private int wheelsNumbers;
    private int speedCount;
    private boolean isMountain;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelsNumbers() {
        return wheelsNumbers;
    }

    public void setWheelsNumbers(int wheelsNumbers) {
        this.wheelsNumbers = wheelsNumbers;
    }

    public int getSpeedCount() {
        return speedCount;
    }

    public void setSpeedCount(int speedCount) {
        this.speedCount = speedCount;
    }

    public boolean isMountain() {
        return isMountain;
    }

    public void setMountain(boolean mountain) {
        isMountain = mountain;
    }
    public void printBikeData(){
        System.out.println("This is: " + getModel());
        System.out.println("Bike speeds: " + getSpeedCount());
        System.out.println("Bike wheels: " +getWheelsNumbers());
        System.out.println(isMountain() ? "This is mountain bike" : "This is ordinary bike");
    }

}
