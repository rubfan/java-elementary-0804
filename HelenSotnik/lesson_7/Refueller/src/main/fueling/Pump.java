package main.fueling;

public class Pump {
    private double fuel;
    private double add;

    public void pumpingStart() {
        System.out.println("Pump is turned on. Start of pumping");
    }

    public void addition(double addition) {
        add = addition / 100;
        System.out.println("Dosed addition of anti-watercrystalline liquid(UWCL): " + addition + "%");
    }

    public void fueling(double fuelAmount) {
        fuel = fuelAmount + fuelAmount * add;
        System.out.println(fuel + " liters of fuel are pumped");
    }

    public void pumpingStop() {
        System.out.println("Pump is turned off. Stop of pumping");
    }
}
