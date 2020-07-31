package abstraktfactory;

public class CurrentTour {
    public TournamentGrid getAbstractTour (NamberTour namberTour) {
        if (namberTour.getTour() < 6) {
            return new FirstCircle();
        }
        else {
            return new SecondCircle();
        }
    }
    


}
