package abstraktfactory;

public interface SpecificTour {
    public String getSpecificTour();
}

class AutumnMatches implements SpecificTour {

    @Override
    public String getSpecificTour() {
        return "Matches will be held in autumn";
    }
}

class SpringMatches implements SpecificTour {

    @Override
    public String getSpecificTour() {
        return "Matches will be held in spring";
    }
}
