package factory;

import factory.Aircraft;
import factory.AircraftFactory;
import factory.AircraftTypes;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        AircraftFactory factory = new AircraftFactory();

        Aircraft military = factory.getAircraft(AircraftTypes.MILITARY);
        Aircraft commercial = factory.getAircraft(AircraftTypes.COMMERCIAL);
        Aircraft rescue = factory.getAircraft(AircraftTypes.RESCUE);

        military.fly();
        commercial.fly();
        rescue.fly();
    }
}
