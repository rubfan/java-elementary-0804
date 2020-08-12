package visitor;

public class PicassoExhibition implements MuseumExhibition {
    @Override
    public void accept(MuseumVisitor museumVisitor) {
        museumVisitor.visit(this);
    }
}
