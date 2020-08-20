package visitor;

public interface Creator {
    void createElement(Binding binding);
    void createElement(TextPage textPage);
    void createElement(IllustratedPage illustratedPage);
}
