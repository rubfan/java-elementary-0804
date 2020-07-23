package visitor;

public class MonochromeBookCreator implements Creator {
    @Override
    public void createElement(Binding binding) {
        System.out.println("Creating monochrome cover...");
    }

    @Override
    public void createElement(TextPage textPage) {
        System.out.println("Creating monochrome text pages...");
    }

    @Override
    public void createElement(IllustratedPage illustratedPage) {
        System.out.println("Creating monochrome illustrated pages...");
    }
}
