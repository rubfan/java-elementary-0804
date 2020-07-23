package visitor;

public class TextPage implements BookElement{
    @Override
    public void create(Creator creator) {
        creator.createElement(this);
    }
}
