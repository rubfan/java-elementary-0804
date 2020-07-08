public class FlashlightMain {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();
        flashlight.setName("Little helper");
        flashlight.setBatteryCount(2);
        flashlight.setWeight(800);
        flashlight.setHasMultiTool(true);
        flashlight.printParameters();
    }
}
