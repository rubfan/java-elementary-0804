package visitor;

public class Museum implements MuseumExhibition {
    private MuseumExhibition[] exhibitions;

    public MuseumExhibition[] getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(MuseumExhibition[] exhibitions) {
        this.exhibitions = exhibitions;
    }

    public Museum() {
        exhibitions = new MuseumExhibition[]{
                new BoschExhibition(),
                new FranciscoGoyaExhibition(),
                new PicassoExhibition(),
                new RubensExhibition(),
                new VelaskesExhibition()};
    }

    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
        for (int i = 0; i < exhibitions.length; i++) {
            exhibitions[i].accept(museumVisitor);
        }
    }
}
