package facade;

public class Workflow {

    private CarBodyPainter cbp = new CarBodyPainter();
    private CarAssembler ca = new CarAssembler();
    private CarWasher cw = new CarWasher();

    public void prepareCar() {
        cbp.startPaint();
        cbp.finishPaint();
        ca.doAssemble(cbp);
        cw.washCar(ca);
    }
}
