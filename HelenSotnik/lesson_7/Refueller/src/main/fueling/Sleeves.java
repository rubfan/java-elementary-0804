package main.fueling;

public class Sleeves {
    private String type;

    public void attach(String fuelingType) {
        type = fuelingType;
        switch (type) {
            case "open":
                System.out.println("Fueling sleeve with discharge nozzle is attached");
                break;
            case "closed":
                System.out.println("Fueling sleeve with adapter for closed fueling is attached");
                break;
            default:
                System.out.println("Wrong type of fueling");
                break;
        }
    }

    public void extract() {
        System.out.println("Sleeve has been extracted");
    }
}
