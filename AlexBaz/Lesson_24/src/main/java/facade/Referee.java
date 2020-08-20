package facade;

class Facade {
    Referee referee = new Referee();
    BallStatus ballStatus = new BallStatus();
    Player player = new Player();

    void playGame() {
        referee.startingWhistle();
        ballStatus.inField();
        player.play(ballStatus);
    }
}

public class Referee {
    public void startingWhistle() {
        System.out.println("starting whistle");
    }

    public void finalWhistle() {
        System.out.println("final whistle");
    }
}

class BallStatus {
    private boolean ball;

    boolean isBall() {
        return ball;
    }

    void inField() {
        ball = true;
    }

    void outField() {
        ball = false;
    }
}

class Player {
    void play(BallStatus ballStatus) {
        if (ballStatus.isBall()) {
            System.out.println("the game is on");
        } else {
        }
    }
}

class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.playGame();
    }
}
