package command;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Driver driver = new Driver(
                new StartCommand(engine),
                new StopCommand(engine),
                new AccelerateCommand(engine),
                new BrakeCommand(engine));

        driver.start.execute();
        driver.accelerate.execute();
        driver.brake.execute();
        driver.stop.execute();

    }
}
