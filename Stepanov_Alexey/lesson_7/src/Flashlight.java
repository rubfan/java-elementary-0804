public class Flashlight {
    private String flashlightName;
    private int batteryCount;
    private int flashlightWeight;
    private boolean hasMultiTool;

    public void setName(String name) {
        flashlightName = name;
    }

    public void setBatteryCount(int batteries) {
        batteryCount = batteries;
    }

    public void setWeight(int weight) {
        flashlightWeight = weight;
    }

    public boolean isHasMultiTool() {
        return hasMultiTool;
    }

    public void setHasMultiTool(boolean multiTool) {
        hasMultiTool = multiTool;
    }

    private void getColour() {
        int number = batteryCount;
        switch (number) {
            case 3:
                System.out.println("\tdo blink");
            case 2:
                System.out.println("\tshine red");
            case 1:
                System.out.println("\tshine white");
                break;
            default:
                System.out.println("\tCan't work. " + batteryCount + " is wrong battery number. Try to put from 1 to 3.");
        }
    }

    public void printParameters() {
        System.out.println(flashlightName + " can:");
        getColour();
        System.out.println("Has " + flashlightWeight + " grams weight");
        System.out.println((isHasMultiTool() ? "Has" : "Don't have") + " multi tool");
    }
}
