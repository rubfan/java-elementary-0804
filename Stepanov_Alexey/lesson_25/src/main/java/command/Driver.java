package command;

public class Driver {
    Command start;
    Command stop;
    Command accelerate;
    Command brake;

    public Driver(Command start, Command stop, Command accelerate, Command brake) {
        this.start = start;
        this.stop = stop;
        this.accelerate = accelerate;
        this.brake = brake;
    }

    void startEngine(){
        start.execute();
    }

    void stopEngine() {
        stop.execute();
    }

    void accelerateEngine() {
        accelerate.execute();
    }

    void  brakeEngine() {
        brake.execute();
    }
}
