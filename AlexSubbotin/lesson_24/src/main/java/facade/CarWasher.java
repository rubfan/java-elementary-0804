package facade;

public class CarWasher {

    public void washCar(CarAssembler carAssembler) {
        if (carAssembler.isAssemblyComplete()) {
            System.out.println("The car is ready for sale!");

        } else {
            System.out.println("The car is not ready for sale, finish all process...");
        }
    }
}
