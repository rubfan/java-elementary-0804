package abstraktfactory;

 class SecondCircle implements TournamentGrid{

    @Override
    public String createTour(NamberTour namberTour) {
        return String.valueOf(namberTour.getTour()) + " tour championship Ukraine!";
    }

    @Override
    public SpecificTour getSpecificTour() {
        return new SpringMatches();
    }

    @Override
    public Sponsor getSponsor() {
        return new SecondCircleInvestor();
    }
}
