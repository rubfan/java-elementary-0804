package state;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();

        engine.setState(new EngineOperate());
        engine.start();
        engine.stop();
        engine.stop();
        engine.start();

        engine.setState(new EngineLocked());
        engine.start();
        engine.stop();
    }
}

/* Output:
Engine started already
Engine stopped
Engine stopped already
Engine started
Start is blocked
Stop is blocked
 */
