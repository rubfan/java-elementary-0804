public class Lamp {
    public LampName lampName = new LampName();
    public NumberOfBatteries numberOfBatteries = new NumberOfBatteries();
    public Shine shine = new Shine();
    public Shockproof shockproof = new Shockproof();
    public WaterResistant waterResistant = new WaterResistant();

    public Lamp() {
    }

    public static void main(String[] args) {
        Lamp lamp_1 = new Lamp();
        lamp_1.lampName.nameGoods("Light sword");
        lamp_1.numberOfBatteries.maxPowerBank(3);
        lamp_1.shine.colorLight(2);
        lamp_1.shockproof.valueLamp(200);
        lamp_1.waterResistant.valueLamp(250);
    }
}
