package visitor;

public class VelaskesExhibition implements MuseumExhibition {
    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
    }
}
