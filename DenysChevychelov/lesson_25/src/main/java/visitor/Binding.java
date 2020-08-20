package visitor;

public class Binding implements BookElement {
    @Override
    public void create(Creator creator) {
        creator.createElement(this);
    }
}
