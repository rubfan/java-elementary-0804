package observer;

public class StateListener implements EventListener {
    private SecuritySystem security;

    public StateListener(SecuritySystem security) {
        this.security = security;
    }

    public void update(String eventType) {
        System.out.println("Security system is " + (security.isSecurityState() ? "On" : "Off"));
    }
}