package chainofresponsibility;

abstract class TournamentPosition {
    int rank;
    private TournamentPosition next;

    public TournamentPosition(int rank) {
        this.rank = rank;
    }

    public void writeMessage(ClubName clubName) {
        if (rank == clubName.getRank()) {
            write(clubName);
        }
        if (next != null) {
            next.writeMessage(clubName);
        }
    }

    public void setNext(TournamentPosition next) {
        this.next = next;
    }

    abstract void write(ClubName clubName);
}

class EuropeTournament {
    public static void main(String[] args) {
        TournamentPosition tp1 = new GroupRoundLC(1);
        TournamentPosition tp2 = new QualifyingRoundLC(2);
        TournamentPosition tp3 = new GroupRoundLE(3);
        TournamentPosition tp4 = new QualifyingRoundLE(4);
        TournamentPosition tp5 = new QualifyingRoundLE(5);
        TournamentPosition tp6 = new QualifyingRoundLE(6);

        tp1.setNext(tp2);
        tp2.setNext(tp3);
        tp3.setNext(tp4);
        tp4.setNext(tp5);
        tp5.setNext(tp6);

        tp1.writeMessage(ClubName.DINAMO);
        tp1.writeMessage(ClubName.SHAHTAR);
        tp1.writeMessage(ClubName.ZORYA);
        tp1.writeMessage(ClubName.DESNA);
        tp1.writeMessage(ClubName.OLEKSANDRIYA);
        tp1.writeMessage(ClubName.KOLOS);

    }
}

enum ClubName {
    DINAMO(1, "Dinamo"), SHAHTAR(2, "Shahtar"), ZORYA(3, "Zorya"),
    DESNA(4, "Desna"), OLEKSANDRIYA(5, "Oleksandriya"), KOLOS(6, "Kolos");
    private int rank;
    private String name;

    ClubName(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}

class GroupRoundLC extends TournamentPosition {
    public GroupRoundLC(int rank) {
        super(rank);
    }

    @Override
    void write(ClubName clubName) {
        System.out.println("Club " + clubName.getName() + " take part in Champions League group round");
    }
}

class QualifyingRoundLC extends TournamentPosition {
    public QualifyingRoundLC(int rank) {
        super(rank);
    }

    @Override
    void write(ClubName clubName) {
        System.out.println("Club " + clubName.getName() + " take part in Champions League qualifying round");
    }
}

class GroupRoundLE extends TournamentPosition {
    public GroupRoundLE(int rank) {
        super(rank);
    }

    @Override
    void write(ClubName clubName) {
        System.out.println("Club " + clubName.getName() + " take part in Europe League group round");
    }
}

class QualifyingRoundLE extends TournamentPosition {
    public QualifyingRoundLE(int rank) {
        super(rank);
    }

    @Override
    void write(ClubName clubName) {
        System.out.println("Club " + clubName.getName() + " take part in Europe League qualifying round");
    }
}
