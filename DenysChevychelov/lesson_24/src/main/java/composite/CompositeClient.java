package composite;

public class CompositeClient {
    public static void main(String[] args) {
        NewspaperFactory newspaperFactory = new NewspaperFactory();
        Writer firstNewsWriter = new NewsWriter();
        Writer secondNewsWriter = new NewsWriter();
        Writer sportNewsWriter = new SportNewsWriter();

        newspaperFactory.addWriter(firstNewsWriter);
        newspaperFactory.addWriter(secondNewsWriter);
        newspaperFactory.addWriter(sportNewsWriter);
        newspaperFactory.removeWriter(secondNewsWriter);

        newspaperFactory.createNewspaper();
    }
}
