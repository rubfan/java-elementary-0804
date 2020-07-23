package command;

public class WashController {
    private Command washCarBody;
    private Command washCarSalon;
    private Command dryCarBody;
    private Command rubCarWindows;

    public WashController(Command washCarBody, Command washCarSalon, Command dryCarBody, Command rubCarWindows) {
        this.washCarBody = washCarBody;
        this.washCarSalon = washCarSalon;
        this.dryCarBody = dryCarBody;
        this.rubCarWindows = rubCarWindows;
    }

    public void executeWashBody() {
        this.washCarBody.execute();
    }

    public void executeWashSalon() {
        this.washCarSalon.execute();
    }

    public void executeDryBody() {
        this.dryCarBody.execute();
    }

    public void executeRubWindows() {
        this.rubCarWindows.execute();
    }
}
