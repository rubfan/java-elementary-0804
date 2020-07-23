package visitor;

public class Book implements BookElement {
    private BookElement[] bookElements;

    public Book() {
        this.bookElements = new BookElement[]{
                new Binding(),
                new TextPage(),
                new IllustratedPage()
        };
    }

    @Override
    public void create(Creator creator) {
        for (BookElement bookElement : this.bookElements) {
            bookElement.create(creator);
        }
    }
}
