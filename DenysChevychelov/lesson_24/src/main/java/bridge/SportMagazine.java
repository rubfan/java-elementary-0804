package bridge;

public class SportMagazine extends Press {
    public SportMagazine(Writer writer) {
        super(writer);
    }

    public void createArticles() {
        System.out.println("Sport magazine in progress...");
        writer.writeArticle();
    }
}
