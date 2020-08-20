package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        GasTurbineEngineFacade facade = new GasTurbineEngineFacade(new ElectricalStarter(),
                new Compressor(), new CombustionChamber(), new FuelController(), new IgniterPlugs(),
                new TurbineBlades(), new Turbine(), new ExhaustNozzle());

        facade.engineStart();
        System.out.println("============================================");
        facade.engineStop();
    }
}
