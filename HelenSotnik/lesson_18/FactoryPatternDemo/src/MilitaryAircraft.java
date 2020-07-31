package factory;

import factory.Aircraft;

public class MilitaryAircraft implements Aircraft {
    public void fly() {
        System.out.println("Military aircraft is in the air and is searching for the target");
    }
}
