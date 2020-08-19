package state;

public class Engine implements State {
    private State state;

    @Override
    public void stop() {
        if (state == null) {
            System.out.println("Engine stopped already");
        } else {
            state.stop();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void start() {
        state.start();
    }


}
