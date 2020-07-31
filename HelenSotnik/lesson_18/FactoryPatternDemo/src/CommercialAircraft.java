package factory;

import factory.Aircraft;

public class CommercialAircraft implements Aircraft {
    public void fly() {
        System.out.println("Commercial aircraft carries passengers");
    }
}
