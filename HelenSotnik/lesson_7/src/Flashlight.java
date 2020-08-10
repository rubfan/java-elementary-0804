package main;

import main.company.Batteries;
import main.company.Casing;
import main.company.SwitchButton;
import main.company.TypeName;

public class Flashlight {
    public TypeName name;
    public SwitchButton switchButton;
    public Casing casing;
    public Batteries batteries;

    public static void main(String[] args) {
        Flashlight fl = new Flashlight();
        fl.name = new TypeName();
        fl.switchButton = new SwitchButton();
        fl.casing = new Casing();
        fl.batteries = new Batteries();

        fl.name.setName("Miner's");
        fl.name.showYourName();

        fl.casing.setMaterial("Aluminium");
        fl.casing.describeMaterial();

        fl.switchButton.turnOn();
        fl.switchButton.turnOff();

        fl.batteries.insert(1);
        fl.batteries.lightMode();
        fl.batteries.chargeLevelIndicator();
    }
}
