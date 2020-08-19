package state;

public class EngineLocked implements State {

    @Override
    public void start() {
        System.out.println("Start is blocked");
    }

    @Override
    public void stop() {
        System.out.println("Stop is blocked");
    }
}