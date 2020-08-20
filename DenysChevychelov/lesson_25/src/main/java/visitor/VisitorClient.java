package visitor;

public class VisitorClient {
    public static void main(String[] args) {
        Book book = new Book();
        Creator monochromeBookCreator = new MonochromeBookCreator();
        Creator colorBookCreator = new ColorBookCreator();

        System.out.println("Create monochrome book:");
        book.create(monochromeBookCreator);
        System.out.println("----------------------------");

        System.out.println("Create color book:");
        book.create(colorBookCreator);
    }
}
