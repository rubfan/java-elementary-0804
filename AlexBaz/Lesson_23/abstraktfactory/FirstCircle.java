package abstraktfactory;

 class FirstCircle implements TournamentGrid {
    @Override
    public String createTour(NamberTour namberTour) {
        return String.valueOf(namberTour.getTour()) + " tour championship Ukraine!";
    }

    @Override
    public SpecificTour getSpecificTour() {
        return new AutumnMatches();
    }

    @Override
    public Sponsor getSponsor() {
        return new FirstCircleInvestor();
    }
}
