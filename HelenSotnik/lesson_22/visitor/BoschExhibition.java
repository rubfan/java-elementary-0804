package visitor;

public class BoschExhibition implements MuseumExhibition {
    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
    }
}
