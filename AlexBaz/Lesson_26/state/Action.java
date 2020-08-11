package state;

class Main {
    public static void main(String[] args) {
        IVO ivo = new IVO();

        ivo.act(State.CALIBRATION);
        System.out.println("____________________________________________________________________________");
        ivo.act(State.WORK);
    }
}

public interface Action {
    public void act(IVO context, State state);
}

//Context   Измеритель нижней границы облаков
class IVO {
    private Action state = new OpenCap();

    public void setState(Action act) {
        this.state = act;
    }

    public void act(State s) {
        state.act(this, s);
    }
}

enum State {
    WORK, CALIBRATION;
}

//замыкание сигнала от крышки передатчика на крышку приемника
class OpenCapDiagonally implements Action {
    public void act(IVO context, State state) {
        System.out.println("Open cap at an angle of 45 degrees");
        context.setState(new Measurements());
        context.act(state);
    }
}

class CloseCap implements Action {
    public void act(IVO context, State state) {
        System.out.println("Close cap");
        context.setState(new OpenCap());
    }
}

class Measurements implements Action {
    public void act(IVO context, State state) {
        System.out.println("Signal action");
        context.setState(new CloseCap());
        context.act(state);
    }
}

class OpenCap implements Action {
    public void act(IVO context, State state) {
        System.out.println("Open cap started");
        if (state == State.CALIBRATION) {
            context.setState(new OpenCapDiagonally());
            context.act(state);
        }
        if (state == State.WORK) {
            context.setState(new OpenCapUp());
            context.act(state);
        }
    }
}

class OpenCapUp implements Action {
    public void act(IVO context, State state) {
        System.out.println("Open cap up 90 degrees");
        context.setState(new Measurements());
        context.act(state);
    }
}
