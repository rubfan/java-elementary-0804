package visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        MuseumExhibition museum = new Museum();
        museum.accept(new PradoMuseumVisitor());
    }
}
