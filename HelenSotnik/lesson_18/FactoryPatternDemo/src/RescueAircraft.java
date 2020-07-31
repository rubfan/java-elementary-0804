package factory;

import factory.Aircraft;

public class RescueAircraft implements Aircraft {
    public void fly() {
        System.out.println("Rescue aircraft is in the air to rescue someone");
    }
}
