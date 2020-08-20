package visitor;

public interface MuseumVisitor {
    public void visit(Museum museum);

    public void visit(FranciscoGoyaExhibition franciscoGoyaExhibition);

    public void visit(PicassoExhibition picassoExhibition);

    public void visit(VelaskesExhibition velaskesExhibition);

    public void visit(RubensExhibition rubensExhibition);

    public void visit(BoschExhibition boschExhibition);
}
