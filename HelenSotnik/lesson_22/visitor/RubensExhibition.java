package visitor;

public class RubensExhibition implements MuseumExhibition {
    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
    }
}
