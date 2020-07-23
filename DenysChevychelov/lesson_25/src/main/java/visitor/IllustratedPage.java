package visitor;

public class IllustratedPage implements BookElement {
    @Override
    public void create(Creator creator) {
        creator.createElement(this);
    }
}
