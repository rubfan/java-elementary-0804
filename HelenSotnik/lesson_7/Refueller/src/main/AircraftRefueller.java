package main;

import main.fueling.Name;
import main.fueling.Engine;
import main.fueling.Pump;
import main.fueling.Sleeves;
import main.fueling.Grounding;

public class AircraftRefueller {
    public Name name;
    public Engine engine;
    public Pump pump;
    public Sleeves sleeves;
    public Grounding grounding;

    public static void main(String[] args) {
        AircraftRefueller rf = new AircraftRefueller();
        rf.name = new Name();
        rf.engine = new Engine();
        rf.pump = new Pump();
        rf.sleeves = new Sleeves();
        rf.grounding = new Grounding();

        rf.name.setName("TZ-22M");
        rf.name.showName();
        rf.engine.go();
        rf.engine.stop();
        rf.grounding.ground();
        rf.sleeves.attach("open");
        rf.pump.pumpingStart();
        rf.pump.addition(5);
        rf.pump.fueling(12000);
        rf.pump.pumpingStop();
        rf.sleeves.extract();
        System.out.println("!Hope you enjoyed aircraft fuelling!");
    }
}
