package facade;

public class CarAssembler {

    private boolean assemblyComplete;

    public boolean isAssemblyComplete() {
        return assemblyComplete;
    }

    public void doAssemble(CarBodyPainter carBodyPainter) {
        if (carBodyPainter.isFinishedPainting()) {
            System.out.println("Assembly in progress...");
            this.assemblyComplete = true;
        } else {
            System.out.println("Assembly is not possible, finish painting...");
            this.assemblyComplete = false;
        }
    }
}
