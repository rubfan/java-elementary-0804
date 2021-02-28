package strategy;

public class Player {

    Strategy behavior;
    String type;

    public Player(String type) {
        this.type = type;
    }

    public void setStrategy(Strategy behavior) {
        this.behavior = behavior;
    }

    public void action() {
        System.out.println("Player: " + this.type);
        this.behavior.actionCommand();
    }
}
