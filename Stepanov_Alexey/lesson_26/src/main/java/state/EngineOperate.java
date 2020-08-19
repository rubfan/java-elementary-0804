package state;

public class EngineOperate implements State {

    private boolean started = true;

    @Override
    public void start() {
        if (started) {
            System.out.println("Engine started already");
        } else {
            this.started = true;
            System.out.println("Engine started");
        }
    }

    @Override
    public void stop() {
        if (started) {
            this.started = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine stopped already");
            ;
        }
    }
}
