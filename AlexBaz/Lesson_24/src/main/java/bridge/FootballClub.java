package bridge;

public abstract class FootballClub {
    PositionOnTheField positionOnTheField;

    public FootballClub(PositionOnTheField p) {
        positionOnTheField = p;
    }

    abstract void showDetails();
}

class Dinamo extends FootballClub {
    public Dinamo(PositionOnTheField p) {
        super(p);
    }

    void showDetails() {
        System.out.println("Dinamo");
        positionOnTheField.setPositionOnTheField();
    }
}

class Zorya extends FootballClub {
    public Zorya(PositionOnTheField p) {
        super(p);
    }

    void showDetails() {
        System.out.println("Zorya");
        positionOnTheField.setPositionOnTheField();
    }
}
