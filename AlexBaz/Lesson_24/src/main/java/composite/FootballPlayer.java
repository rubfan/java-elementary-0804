package composite;

import java.util.ArrayList;
import java.util.List;

public interface FootballPlayer {
    void position ();
}

class Composite implements FootballPlayer {
    private List<FootballPlayer> players = new ArrayList<FootballPlayer>();

    void addPlayers (FootballPlayer player) {
        players.add(player);
    }

    void removePlayers (FootballPlayer player) {
        players.remove(players);
    }

    @Override
    public void position() {
        for (FootballPlayer player : players) {
            player.position();
        }
    }
}

class Defender implements FootballPlayer {
    @Override
    public void position() {
        System.out.println("protecting the goalkeeper");
    }
}

class Midfielder implements FootballPlayer {
    @Override
    public void position() {
        System.out.println("organizing the game");
    }
}

class Forward implements FootballPlayer {
    @Override
    public void position() {
        System.out.println("scoring goals");
    }
}

class Goalkeeper implements FootballPlayer {
    @Override
    public void position() {
        System.out.println("protecting the gate");
    }
}

class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        Composite composite3 = new Composite();

        composite1.addPlayers(new Goalkeeper());
        composite1.addPlayers(new Defender());
        composite1.addPlayers(new Defender());
        composite1.addPlayers(new Defender());
        composite1.addPlayers(new Defender());

        composite2.addPlayers(new Midfielder());
        composite2.addPlayers(new Midfielder());
        composite2.addPlayers(new Midfielder());
        composite2.addPlayers(new Midfielder());

        composite3.addPlayers(new Forward());
        composite3.addPlayers(new Forward());

        composite.addPlayers(composite1);
        composite.addPlayers(composite2);
        composite.addPlayers(composite3);
        composite.position();
    }
}
