package observer;

public class SecuritySystem {
    public EventManager events;
    private boolean securityState = false;

    public SecuritySystem() {
        this.events = new EventManager("on", "off", "openDoor");
    }

    public void securityOn() {
        this.securityState = true;
        events.notify("on");
    }

    public void securityOff() {
        this.securityState = false;
        events.notify("off");
    }

    public void openDoor() {
        if (this.securityState) {
            events.notify("openDoor");
        }
    }

    public boolean isSecurityState() {
        return securityState;
    }
}
