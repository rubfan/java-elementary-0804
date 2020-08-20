package command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Car car = new Car();

        Command forwardCommand = new ForwardCommand(car);
        Command backwardCommand = new BackwardCommand(car);
        Command wheelsLeftCommand = new WheelLeftCommand(car);
        Command wheelsRightCommand = new WheelRightCommand(car);

        CarRemoteControl carRC = new CarRemoteControl();

        carRC.setCommandName("forward", forwardCommand);
        carRC.setCommandName("backward", backwardCommand);
        carRC.setCommandName("left", wheelsLeftCommand);
        carRC.setCommandName("right", wheelsRightCommand);

        carRC.execute("forward");
        carRC.execute("backward");
        carRC.execute("left");
        carRC.execute("right");
    }
}
