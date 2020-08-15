package observer;

public class AlarmListener implements EventListener {
    private SecuritySystem security;

    public AlarmListener(SecuritySystem security) {
        this.security = security;
    }

    public void update(String eventType) {
        if (security.isSecurityState()) {
            System.out.println("Warning unauthorised access!");
        }
    }
}