package strategy;

public class TimeoutStarter implements Operation {
    public void doOperation() {
        System.out.println("Starting timeout 15 min....");
    }
}
