package decorator;

interface PlayerInterface {
    void print();
}

class ShowPlayer implements PlayerInterface {
    String fullName;

    public ShowPlayer(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void print() {
        System.out.println(fullName);
    }
}

abstract class Decorator implements PlayerInterface{
    PlayerInterface player;

    public Decorator(PlayerInterface player) {
        this.player = player;
    }

    public void print (){
        player.print();
    }

}

class HighLeaguePlayer extends Decorator {
    public HighLeaguePlayer(PlayerInterface player) {
        super(player);
    }

    @Override
    public void print() {
        System.out.print("Player high league - ");
        super.print();
    }
}

class FirstLeaguePlayer extends Decorator {
    public FirstLeaguePlayer(PlayerInterface player) {
        super(player);
    }

    @Override
    public void print() {
        System.out.print("Player first league - ");
        super.print();
    }
}

class SecondLeaguePlayer extends Decorator {
    public SecondLeaguePlayer(PlayerInterface player) {
        super(player);
    }

    @Override
    public void print() {
        System.out.print("Player second league - ");
        super.print();
    }
}

class Main {
    public static void main(String[] args) {
        PlayerInterface player = new HighLeaguePlayer(new ShowPlayer("Oleksandr Baz"));
        player.print();
    }
}
