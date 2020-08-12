package visitor;

public class PradoMuseumVisitor implements MuseumVisitor {
    @Override
    public void visit(Museum museum) {
        System.out.println("Visit to Milan Prado Museum: ");
    }

    @Override
    public void visit(FranciscoGoyaExhibition franciscoGoyaExhibition) {
        System.out.println("You are welcome to visit Francisco Goya Exhibition in Prado Museum");
    }

    @Override
    public void visit(PicassoExhibition picassoExhibition) {
        System.out.println("You are welcome to visit Picasso Exhibition in Prado Museum");
    }

    @Override
    public void visit(VelaskesExhibition velaskesExhibition) {
        System.out.println("You are welcome to visit Velaskes Exhibition in Prado Museum");

    }

    @Override
    public void visit(RubensExhibition rubensExhibition) {
        System.out.println("You are welcome to visit Rubens Exhibition in Prado Museum");
    }

    @Override
    public void visit(BoschExhibition boschExhibition) {
        System.out.println("You are welcome to visit Bosch Exhibition in Prado Museum");
    }
}
