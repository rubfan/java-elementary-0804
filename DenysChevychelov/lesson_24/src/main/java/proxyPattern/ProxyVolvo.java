package proxyPattern;

public class ProxyVolvo implements Car {
    private boolean turnOffAlarm = false;
    private Volvo volvo;

    public ProxyVolvo(boolean turnOffAlarm) {
        this.turnOffAlarm = turnOffAlarm;
    }

    public void move() {
        if (volvo == null) {
            volvo = new Volvo(turnOffAlarm);
            volvo.move();
        }
    }
}
