package factory;

import factory.Aircraft;
import static factory.AircraftTypes.*;

public class AircraftFactory {
    public Aircraft getAircraft(AircraftTypes type) {
        Aircraft aircraft = null;
        switch (type) {
            case MILITARY:
                aircraft = new MilitaryAircraft();
                break;
            case COMMERCIAL:
                aircraft = new CommercialAircraft();
                break;
            case RESCUE:
                aircraft = new RescueAircraft();
                break;
            default:
                System.out.println("Wrong aircraft type:" + type);
        }
        return aircraft;
    }
}
