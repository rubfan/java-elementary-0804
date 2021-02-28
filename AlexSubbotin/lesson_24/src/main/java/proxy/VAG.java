package proxy;

public class VAG implements Car {

    private boolean turnOffAlarm = false;

    public VAG (boolean turnOffAlarm) {
        this.turnOffAlarm = turnOffAlarm;
        startEngine();
    }

    public void startEngine() {
        if (turnOffAlarm) {
            System.out.println("Engine started...");
        }
    }

    public void move() {
        System.out.println("Car is moving...");
    }
}
