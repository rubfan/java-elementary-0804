package observer;

public class Main {
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();
        security.events.subscribe("on", new StateListener(security));
        security.events.subscribe("off", new StateListener(security));
        security.events.subscribe("openDoor", new AlarmListener(security));

        security.securityOn();  // Security system is On
        security.securityOff(); // Security system is Off
        security.openDoor();    // -no output-
        security.securityOn();  // Security system is On
        security.openDoor();    // Warning unauthorised access!
    }
}
