package command;

public interface Command {
    public void execute();
}

class Main {
    public static void main(String[] args) {
        Couch couch = new Couch();
        Team team = new Team(new AttackCommand(couch), new CounterattackCommand(couch), new ProtectionCommand(couch));

        team.attackCouch();
        team.counterattackCouch();
        team.protectionCouch();
    }
}

class Team {
    Command attack;
    Command counterattack;
    Command protection;

    public Team(Command attack, Command counterattack, Command protection) {
        this.attack = attack;
        this.counterattack = counterattack;
        this.protection = protection;
    }

    void attackCouch() {
        attack.execute();
    }

    void counterattackCouch() {
        counterattack.execute();
    }

    void protectionCouch() {
        protection.execute();
    }
}

class Couch {
    void attack() {
        System.out.println("Attack");
    }

    void counterattack() {
        System.out.println("Counterattack");
    }

    void protection() {
        System.out.println("Protection");
    }
}

class CounterattackCommand implements Command {
    Couch couch;

    public CounterattackCommand(Couch couch) {
        this.couch = couch;
    }

    public void execute() {
        couch.counterattack();
    }
}

class ProtectionCommand implements Command {
    Couch couch;

    public ProtectionCommand(Couch couch) {
        this.couch = couch;
    }

    public void execute() {
        couch.protection();
    }
}

class AttackCommand implements Command {
    Couch couch;

    public AttackCommand(Couch couch) {
        this.couch = couch;
    }

    public void execute() {
        couch.attack();
    }
}
