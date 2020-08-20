package command;

public class CommandClient {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        WashController washController = new WashController(
                new BodyWasher(carWash),
                new SalonWasher(carWash),
                new BodyDryer(carWash),
                new WindowsRubber(carWash)
        );

        washController.executeWashBody();
        washController.executeWashSalon();
        washController.executeDryBody();
        washController.executeRubWindows();
    }
}
