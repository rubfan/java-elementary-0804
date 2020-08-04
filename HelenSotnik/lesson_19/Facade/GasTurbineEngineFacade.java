package facade;

public class GasTurbineEngineFacade {
    private ElectricalStarter electricalStarter;
    private Compressor compressor;
    private CombustionChamber combustionChamber;
    private FuelController fuelController;
    private IgniterPlugs igniterPlugs;
    private TurbineBlades turbineBlades;
    private Turbine turbine;
    private ExhaustNozzle exhaustNozzle;

    public GasTurbineEngineFacade(ElectricalStarter es, Compressor c, CombustionChamber cc, FuelController fc,
                                  IgniterPlugs ip, TurbineBlades tb, Turbine t, ExhaustNozzle en) {
        this.electricalStarter = es;
        this.compressor = c;
        this.combustionChamber = cc;
        this.fuelController = fc;
        this.igniterPlugs = ip;
        this.turbineBlades = tb;
        this.turbine = t;
        this.exhaustNozzle = en;
    }

    public void engineStart() {
        electricalStarter.startACompressor();
        compressor.rotate();
        fuelController.injectFuel();
        combustionChamber.burnAirFuelMixture();
        igniterPlugs.ignite();
        turbineBlades.rotateTurbine();
        turbine.drive();
        exhaustNozzle.produceThrust();
        System.out.println("Congratulations! Gas Turbine Engine is started.");
    }

    public void engineStop() {
        fuelController.injectingStop();
        igniterPlugs.turnOff();
        electricalStarter.turnOff();
        compressor.stop();
        turbine.stop();
        System.out.println("Gas Turbine Engine is stopped.");
    }
}
