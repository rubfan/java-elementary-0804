package abstraktfactory;

public enum  NamberTour {
    FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), SIXTH(6), SEVENTH(7), EIGHTH(8), NINTH(9), TENTH(10);
    private int tour;

    NamberTour(int tour) {
        this.tour = tour;
    }

    public int getTour() {
        return tour;
    }
}
