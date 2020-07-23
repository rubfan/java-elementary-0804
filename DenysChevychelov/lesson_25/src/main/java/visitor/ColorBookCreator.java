package visitor;

public class ColorBookCreator implements Creator {
    @Override
    public void createElement(Binding binding) {
        System.out.println("Creating color book cover...");
    }

    @Override
    public void createElement(TextPage textPage) {
        System.out.println("Creating color text pages...");
    }

    @Override
    public void createElement(IllustratedPage illustratedPage) {
        System.out.println("Creating color illustrated pages...");
    }
}
