public class FunCar {
    public GasTank amOfFuel = new GasTank();
    public SteeringWheel move=new SteeringWheel();
    public SteeringWheel stw = new SteeringWheel();
    public Headlight light = new Headlight();
    public Motor motor = new Motor();

    public static void main(String[] args) {
        FunCar c = new FunCar();
        c.amOfFuel.amountOfFuel(30);
        if (c.amOfFuel.fullTank()) {
            c.motor.motorW();
            c.light.turnOnHeadlight();
            c.stw.sayBeep();
           c.move.turn("right");




        }
    }
}