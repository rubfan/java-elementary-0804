package Lamp;

public class Task1 {
    public NameLamp nameLamp = new NameLamp();
    public Batteries batteries = new Batteries();

    public static void main(String[] args) {
        Task1 lamp1 = new Task1();
        lamp1.nameLamp.setName("For Night");
        lamp1.nameLamp.outName();
        lamp1.batteries.setBatteries(4);
        lamp1.batteries.showSetBattery();
        lamp1.batteries.showIsWorking();
    }
}
