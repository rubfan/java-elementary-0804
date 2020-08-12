package visitor;

public class FranciscoGoyaExhibition implements MuseumExhibition {
    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
    }
}
