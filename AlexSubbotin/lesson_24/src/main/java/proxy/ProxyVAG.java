package proxy;

public class ProxyVAG implements Car {

    private boolean turnOffAlarm = false;
    private VAG volvo;

    public ProxyVAG(boolean turnOffAlarm) {
        this.turnOffAlarm = turnOffAlarm;
    }

    public void move() {
        if (volvo == null) {
            volvo = new VAG(turnOffAlarm);
            volvo.move();
        }
    }
}
